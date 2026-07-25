package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean
   public User createdUser(){
       return new User(18,"Yogesh");
   }
   /*  @Bean   to handle dependency function using @Bean which can.t be handled using @Component
   *    public CartService cartService(){
   *    return new CartService()
   * }
   * */
    @Bean
    @Qualifier
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
//    @Primary
    @Qualifier
    public PaymentService  createUpiPayment(){
        return new UpiPayment();
    }

    @Bean

    public OrderService order(@Qualifier("createUpiPayment") PaymentService paymentService){
        return new OrderService(paymentService);
    }
}
