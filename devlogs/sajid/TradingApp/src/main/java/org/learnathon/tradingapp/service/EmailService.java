package org.learnathon.tradingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendVerificationOTPEmail(String email, String otp) throws MessagingException {
        // Create MimeMessage instance using JavaMailSender (from Spring Boot)
        MimeMessage message = javaMailSender.createMimeMessage();

        // Use MimeMessageHelper to construct the email message
        MimeMessageHelper helper = new MimeMessageHelper(message, "utf-8");

        // Set recipient, subject, and body content
        helper.setTo(email);
        helper.setSubject("Your OTP Verification Code");
        helper.setText("Your OTP code is: " + otp);

        // Send the email
        javaMailSender.send(message);
    }
}
