package org.learnathon.tradingapp.service;

import org.learnathon.tradingapp.model.TwoFactorOTP;
import org.learnathon.tradingapp.model.User;

public interface TwoFactorOTPService {
    TwoFactorOTP generateOTP(User user, String otp, String jwt);
    TwoFactorOTP findByUser(Long userId);
    TwoFactorOTP findById(String id);
    boolean verifyTwoFactorOTP(TwoFactorOTP twoFactorOTP , String otp);
    void deleteTwoFactorOTP(TwoFactorOTP twoFactorOTP);

}
