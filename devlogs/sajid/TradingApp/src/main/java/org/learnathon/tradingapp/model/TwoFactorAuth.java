package org.learnathon.tradingapp.model;


import org.learnathon.tradingapp.domain.VerificationType;

public class TwoFactorAuth {
    private boolean isEnabled;
    private VerificationType sendTo;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public VerificationType getSendTo() {
        return sendTo;
    }

    public void setSendTo(VerificationType sendTo) {
        this.sendTo = sendTo;
    }
}
