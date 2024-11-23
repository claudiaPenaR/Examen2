package com.platinum.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public SomeService someService() {
        return new SomeService(); // Tu servicio de prueba
    }
}
