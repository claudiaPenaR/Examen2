package com.platinum.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("username")); // Cambia el ID según el formulario real
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password")); // Cambia el ID según el formulario real
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("loginBtn")); // Cambia el ID según el formulario real
    }

    public void login(String username, String password) {
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }
}

