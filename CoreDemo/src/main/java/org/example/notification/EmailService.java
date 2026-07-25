package org.example.notification;

public class EmailService implements NotificationService {
    @Override
    public void sentNotification() {
        System.out.println("Email service sent");
    }

}
