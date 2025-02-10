package org.learnathon.tradingapp.service;
import org.learnathon.tradingapp.model.TwoFactorOTP;
import org.learnathon.tradingapp.model.User;
import org.learnathon.tradingapp.repository.TwoFactorOTPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
public class TwoFactorOTPServiceImpl implements TwoFactorOTPService {
    @Autowired
    private final TwoFactorOTPRepository twoFactorOTPRepository;

    public TwoFactorOTPServiceImpl(TwoFactorOTPRepository twoFactorOTPRepository) {
        this.twoFactorOTPRepository = twoFactorOTPRepository;
    }

    @Override
    public TwoFactorOTP generateOTP(User user, String otp, String jwt) {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString();
        TwoFactorOTP twoFactorOTP = new TwoFactorOTP();
        twoFactorOTP.setUser(user);
        twoFactorOTP.setOtp(otp);
        twoFactorOTP.setJwt(jwt);
        twoFactorOTP.setId(id);
        return twoFactorOTPRepository.save(twoFactorOTP);
    }

    @Override
    public TwoFactorOTP findByUser(Long userId) {
        User user=new User();
        user.setId(userId);
        return twoFactorOTPRepository.findByUser(user);
    }

    @Override
    public TwoFactorOTP findById(String id) {
        Optional<TwoFactorOTP> twoFactorOTP = twoFactorOTPRepository.findById(id);
        return twoFactorOTP.orElse(null);
    }

    @Override
    public boolean verifyTwoFactorOTP(TwoFactorOTP twoFactorOTP, String otp) {
        return twoFactorOTP.getOtp().equals(otp);
    }

    @Override
    public void deleteTwoFactorOTP(TwoFactorOTP twoFactorOTP) {
        twoFactorOTPRepository.delete(twoFactorOTP);
    }
}
