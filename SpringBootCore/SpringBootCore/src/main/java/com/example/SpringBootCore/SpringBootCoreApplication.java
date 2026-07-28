package com.example.SpringBootCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/* @SpringBootApplication this annotation contains -
   1. @SpringBootConfiguration - like @Configuration
   2. @ComponentScan
   3. @EnableAutoConfiguration - look at the project and create beans which is important to you
   @SpringBootApplication(scanBasePackages = "package")   */
@SpringBootApplication
public final class SpringBootCoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootCoreApplication.class, args);
	   OrderService order = context.getBean(OrderService.class);
	   order.placeOrder();
	}

//	@Bean
//	public UserService getUserService(){
//		return new UserService();
//	}
}
