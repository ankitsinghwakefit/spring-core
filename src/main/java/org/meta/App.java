package org.meta;

import org.javaConfig.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // many ways to connect with spring context
        // XML / Java based config / Annotations

        // Java based config

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Desktop de = context.getBean("desk", Desktop.class); here desk is name of
        // bean

        Alien al = context.getBean(Alien.class);
        System.out.println(al.getAge());
        al.code();

        Desktop de = context.getBean(Desktop.class);
        de.code();
        Desktop de2 = context.getBean("desktop", Desktop.class);
        de2.code();

        // XML based config

        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("spring.xml"); // all object will be created
        // on
        // // this step only if bean is
        // // defined in config file
        // Alien ab = (Alien) context.getBean("alien"); // alien is name we are asking
        // spring to give object of this name
        // ab.code();
        // System.out.println(ab.getAge());
        // Computer myDesktop = context.getBean(Desktop.class); // we don't have to do
        // type cast here
        // myDesktop.code();
        // Computer myLaptop = context.getBean(Laptop.class);
        // myLaptop.code();
    }
}
