package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
  private   PaymentService paymentService;
/*  By using lazy initialization we create a proxy of Payment service and then
a bean of OrderService is created  hence the problem of circular dependency is resolve because the
bean creation is the problem that we faced in circular dependency
   @Lazy -   created bean when required
    by default spring is eager
    we can change the property and set all bean as Lazy and when we want eager initialization we
    do  @Lazy(value = "false")
*/
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.pay();
//        getOrderDetails();
        System.out.println("order placed");
    }
    public void getOrderDetails(){
        System.out.println("order details");
    }
}
