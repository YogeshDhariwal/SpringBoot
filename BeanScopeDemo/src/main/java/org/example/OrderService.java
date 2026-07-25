package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")  // lazy initialization
public class OrderService {
    public OrderService() {
        System.out.println("order service created");
    }

    public void placeOrder() {
        System.out.println("order placed");
    }

}
