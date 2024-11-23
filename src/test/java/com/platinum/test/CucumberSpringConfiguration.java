package com.platinum.test;




import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.context.annotation.ContextConfiguration;
import ccom.platinum.test.config.TestConfig; // Ajusta el nombre de tu clase de configuración

@CucumberContextConfiguration
@ContextConfiguration(classes = TestConfig.class) // Asegúrate de que TestConfig sea tu clase de configuración de Spring
public class CucumberSpringConfiguration {
}
