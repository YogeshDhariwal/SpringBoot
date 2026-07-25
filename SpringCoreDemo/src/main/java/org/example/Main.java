package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
       OrderService orderService = applicationContext.getBean(OrderService.class);
       orderService.placeOrder();
      User user = applicationContext.getBean(User.class);
        System.out.println(user.getName());
 
    }
}