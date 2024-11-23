package com.platinum.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/resources/features",  // Ruta a los archivos .feature
    glue = "com.platinum.test",                // Paquete donde están las Step Definitions
    plugin = {"pretty"}                        // Salida legible
)
public class LoginTest {
}
