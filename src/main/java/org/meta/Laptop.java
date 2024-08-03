package org.meta;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    // public Laptop() {
    // System.out.println("Laptop object created");
    // }

    public void code() {
        System.out.println("coding from Laptop object");
    }
}
