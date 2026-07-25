package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    private final PaymentService paymentService ;

    @Autowired
    /*  if there is only one constructor there is no need to write @Autowirded @Qualifier("upiPayment") */
    public OrderService( PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//   @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void  placeOrder(){
           paymentService.pay();
           System.out.println("order placed");
       }

}
