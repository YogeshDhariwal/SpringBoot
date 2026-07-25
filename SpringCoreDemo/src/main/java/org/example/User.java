package org.example;

import org.springframework.stereotype.Component;

// @Component  can not be used because spring doesn't know which age
// , name to be used while creating bean  and 1 more case where @Component can't be used is when we
// try to handle the jar files or external dependency using spring
public class User {
   private String name;
   private int age;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
