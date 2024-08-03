package org.javaConfig;

import org.meta.Alien;
import org.meta.Computer;
import org.meta.Desktop;
import org.meta.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.meta")
public class AppConfig {

    // @Bean(name = "desk") by default name of beans will be method name but we can
    // override name by passing name as a parameter
    // @Bean
    // @Scope(value = "prototype")
    // public Desktop desktop() {
    // return new Desktop();
    // }

    // @Bean
    // @Primary
    // public Laptop laptop() {
    // return new Laptop();
    // }

    // @Bean
    // public Alien alien(@Qualifier("desktop") Computer computer) {
    // Alien a = new Alien();
    // a.setAge(21);
    // a.setCom(computer);
    // return a;
    // // return new Alien(21, desktop());
    // }

}
