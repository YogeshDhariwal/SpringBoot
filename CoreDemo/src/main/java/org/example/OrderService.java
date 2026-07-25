package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.SmsService;

public class OrderService {
    /*That EmailService is dependency of OrderService if we  want to  send the otification via
    sms etc we need to create other class object and according to open close principle we don't
    have to modify a class but can extend it that helps to achieve loosely coupled program  */
    NotificationService notification ;

    /*  we can use setter and constructor for dependency injection*/
    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder(){
        System.out.println("order placed");
        notification.sentNotification();
    }
}
