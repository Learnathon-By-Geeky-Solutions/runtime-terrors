package org.learnathon.tradingapp.repository;

import org.learnathon.tradingapp.model.TwoFactorOTP;
import org.learnathon.tradingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TwoFactorOTPRepository extends JpaRepository<TwoFactorOTP, String> {
    TwoFactorOTP findByUser(User user);
}
