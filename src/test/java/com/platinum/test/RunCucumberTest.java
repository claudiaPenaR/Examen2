package com.platinum.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/platinum/test", // Ruta donde se encuentra el archivo .feature
    glue = "com.platinum.tests",      // Paquete donde se encuentran las definiciones de los pasos
    plugin = {"pretty"}
)
public class RunCucumberTest {
}
