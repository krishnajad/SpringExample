package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Laptop laptop(){

        return new Laptop();
    }

    @Bean
    //@Scope("prototype")        // It crete Object every single time when bean is called.
    public Dextop dextop(){
        return new Dextop();
    }

    @Bean
    public Alian alian(){
        return new Alian();
    }
}
