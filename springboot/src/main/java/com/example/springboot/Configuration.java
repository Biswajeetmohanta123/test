package com.example.springboot;


import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Objects objects(){
        String name = "Biswajit";
        String address = "Odisha";
        return new Objects(name,address);
    }
}
