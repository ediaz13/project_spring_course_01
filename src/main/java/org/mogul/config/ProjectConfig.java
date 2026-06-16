package org.mogul.config;

import org.mogul.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.mogul.main")
public class ProjectConfig {

    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    /*
    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Soma");
        return p;
    }

    @Bean(name = "Mogul")
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Mogul");
        return p;
    }

     */
    }
