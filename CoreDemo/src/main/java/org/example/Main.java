package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notification;
        notification = new SmsService();
        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}
//  A class should ask what it needs and not build everything itself
//  IOC is an idea or principle but DI is a technique to achieve IOC