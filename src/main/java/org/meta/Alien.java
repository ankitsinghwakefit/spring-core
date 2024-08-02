package org.meta;

import org.springframework.beans.factory.annotation.Autowired;

public class Alien {

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

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        com.code();
    }
}
