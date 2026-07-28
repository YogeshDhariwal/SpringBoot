package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
     // get bean by name,id
      //  OrderService order = (OrderService) context.getBean("orderService");

      // get bean by type
      // OrderService order  = context.getBean(OrderService.class);

        OrderService order =  context.getBean("orderService2",OrderService.class);
       order.placeOrder();
    }
}