package org.learnathon.tradingapp.service;

import org.learnathon.tradingapp.domain.VerificationType;
import org.learnathon.tradingapp.model.User;

public interface UserService {
    public User findUserByJwt(String jwt) throws Exception;
    public User findUserByEmail(String email) throws Exception;
    public User findUserById(Long userId) throws Exception;
    public User enableTwoFactorAuthentication(VerificationType verificationType, String sendTo,User user);
    User updatePassword(User user,String newPassword);

}
