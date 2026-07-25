package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);
        OrderService order2 = context.getBean(OrderService.class);
//   Every bean has only one object per bean definition is called singleton scope
        //  singleton : stateless  like OrderService handle only order not have its own state
        //  prototype : stateful like User class can have many users
    }
}