package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();
        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));
         context.close();
    }
}
/*        1.   start IOC container
          2.   Read configuration
          3.   Read bean definition
          4.   Instantiate objects
          5.   Dependencies are injected
          6.   Aware Interfaces are called
          7.   Initialization callbacks( spring  call som methods before working with the bean methods
                                          like clear some value ,insert some value , work with cache memory )
                Types -  a) InitializingBean (implements initializing)
                         b)  init Method   (@Bean(initMethod = "name')
                         c)  Post construct (@PostConstrut)
          8.   Bean is ready to use
          9.   Destruction callbacks
               Types - a) DisposableBean
                       b) destroyMethod
                       c) preDestroy
          10.  Bean is destroyed
* */
// Aware Interface - special method  so that we got information about  beans , application context etc.