package org.meta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("20") // field injection
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien created");
    }

    public Alien(int age, Computer com) {
        // System.out.println("para constructor called");
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    @Value("21") // setter injection
    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("desktop") // namw will be class name in small case || Annotate with @Primary to class
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        com.code();
    }
}
