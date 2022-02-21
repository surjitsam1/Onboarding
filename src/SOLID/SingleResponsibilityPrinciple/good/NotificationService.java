package SOLID.SingleResponsibilityPrinciple.good;

public class NotificationService {
    public void sendOTP(String mode) {
        if (mode.equals("email")) {
            // send email
        }

        if (mode.equals("sms")) {
            // send sms
        }
    }
}
