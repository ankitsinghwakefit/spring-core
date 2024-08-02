package org.meta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // many ways to connect with spring context
        // XML / Java based config / Annotations
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // all object will be created on
                                                                                       // this step only if bean is
                                                                                       // defined in config file
        Alien ab = (Alien) context.getBean("alien"); // alien is name we are asking spring to give object of this name
        ab.code();
        System.out.println(ab.getAge());
        Computer myDesktop = context.getBean(Desktop.class); // we don't have to do type cast here
        myDesktop.code();
        Computer myLaptop = context.getBean(Laptop.class);
        myLaptop.code();
    }
}
