package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import java.util.HashMap;

@Component
public class CartService  implements BeanNameAware, ApplicationContextAware
        /*implements InitializingBean , DisposableBean*/ {
     HashMap<Integer,String> map;
     public  CartService(){
         map = new HashMap<>();
         System.out.println("hashmap is created");
     }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is "+ applicationContext);
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initializing callback");
//         map.put(1,"Yogesh");
//         map.put(2,"Dhariwal");
//    }
    @PostConstruct
  public void setValue(){
      System.out.println("Initializing callback");
        map.put(1,"Yogesh");
         map.put(2,"Dhariwal");
  }
    public String getValue(int key){
         return map.get(key);
    }
@PreDestroy
    public void stop(){
        map.clear();
        System.out.println("Bean is getting destroyed");
    }

//    @Override
//    public void destroy() throws Exception {
//        map.clear();
//        System.out.println("Bean is getting destroyed");
//    }
}
/*     Initialization callback is used before we call some methods we perform
       some action like clear some data,insert some data in a function , load a file before call bean methods
*/
