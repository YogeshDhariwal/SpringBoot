package org.example.notification;

public class SmsService implements NotificationService {
    @Override
    public void sentNotification() {
        System.out.println("sms is sent");
    }
}
