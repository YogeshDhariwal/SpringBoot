package com.example.SpringBootCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

      private PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public boolean isEnabled() {
        return paymentProperties.isEnabled();
    }


    public String getType() {
        return paymentProperties.getType();
    }

    public int getRetryCount(){
        return paymentProperties.getRetryCount();
    }
   public  int timeout(){
        return paymentProperties.getTimeout();
   }
}
//    @Value("${paymentGateway.type:RazorPay}")
//    private String type;
//
//    @Value("${paymentGateway.retryCount:5}")
//    private int retryCount;

//    public PaymentGateway(@Value("${paymentGateway.type}") String type,@Value("${paymentGateway.retryCount}") int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//  }