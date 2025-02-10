package org.learnathon.tradingapp.controller;
import jakarta.mail.MessagingException;
import org.learnathon.tradingapp.config.JwtProvider;
import org.learnathon.tradingapp.model.TwoFactorOTP;
import org.learnathon.tradingapp.model.User;
import org.learnathon.tradingapp.repository.UserRepository;
import org.learnathon.tradingapp.response.AuthResponse;
import org.learnathon.tradingapp.service.CustomUserDetailsService;
import org.learnathon.tradingapp.service.EmailService;
import org.learnathon.tradingapp.service.TwoFactorOTPService;
import org.learnathon.tradingapp.utils.OtpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CustomUserDetailsService userDetailsService;
    @Autowired
    private TwoFactorOTPService twoFactorOTPService;
    @Autowired
    private EmailService emailService;
    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> register(@RequestBody User user) {
        if(userRepository.findByEmail(user.getEmail()) != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        User newUser = new User();
        newUser.setFullName(user.getFullName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        User savedUser = userRepository.save(newUser);
        Authentication authentication=new UsernamePasswordAuthenticationToken(
                user.getEmail(),
                user.getPassword());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt= JwtProvider.generateToken(authentication);
        AuthResponse authResponse=new AuthResponse();
        authResponse.setJwt(jwt);
        authResponse.setStatus(true);
        authResponse.setMessage("User Registered Successfully");
        return new ResponseEntity<>(authResponse, HttpStatus.CREATED);
    }
    @PostMapping("/signin")
    public ResponseEntity<AuthResponse> login(@RequestBody User user) throws MessagingException {

        Authentication authentication=authenticate(user.getEmail(),user.getPassword());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt= JwtProvider.generateToken(authentication);
        User authUser=userRepository.findByEmail(user.getEmail());
        if(user.getTwoFactorAuth().isEnabled())
        {
            AuthResponse authResponse=new AuthResponse();
            authResponse.setMessage("Two Factor Authentication Enabled");
            authResponse.setTwoFactorEnabled(true);
            String otp= OtpUtils.generateOTP();
            TwoFactorOTP oldTwoFactorOTP=twoFactorOTPService.findByUser(authUser.getId());
            if(oldTwoFactorOTP!=null)
            {
                twoFactorOTPService.deleteTwoFactorOTP(oldTwoFactorOTP);
            }else{
                TwoFactorOTP twoFactorOTP=twoFactorOTPService.generateOTP(authUser,otp,jwt);
                emailService.sendVerificationOTPEmail(user.getEmail(), otp);
            }
            authResponse.setSession(new TwoFactorOTP().getId());
            return new ResponseEntity<>(authResponse, HttpStatus.ACCEPTED);
        }
        AuthResponse authResponse=new AuthResponse();
        authResponse.setJwt(jwt);
        authResponse.setStatus(true);
        authResponse.setMessage("Login Success . ");
        return new ResponseEntity<>(authResponse, HttpStatus.OK);
    }

    private Authentication authenticate(String email, String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(email);
        if(userDetails==null)
        {
            throw new BadCredentialsException("Invalid Email");
        }
        else if(!password.equals(userDetails.getPassword()))
        {
            throw new BadCredentialsException("Invalid Password");
        }
        return new UsernamePasswordAuthenticationToken(userDetails.getUsername(),userDetails.getPassword(),userDetails.getAuthorities());
    }
    public ResponseEntity<AuthResponse> verifySigninOtp(@PathVariable String otp,@RequestParam String id) throws Exception {
        TwoFactorOTP twoFactorOTP=twoFactorOTPService.findById(id);
        if(twoFactorOTPService.verifyTwoFactorOTP(twoFactorOTP,otp))
        {
            AuthResponse authResponse=new AuthResponse();
            authResponse.setMessage("Two factor authentication Varified ");
            authResponse.setTwoFactorEnabled(true);
            authResponse.setJwt(twoFactorOTP.getJwt());
            return  new ResponseEntity<>(authResponse,HttpStatus.OK);
        }
        throw new Exception("Invalid OTP");

    }
}