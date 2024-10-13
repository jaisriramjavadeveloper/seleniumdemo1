package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;
    
    // Locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterUsername(String username) throws InterruptedException {
        driver.findElement(usernameField).sendKeys(username);
        Thread.sleep(3000); // Pause for 3 seconds
    }

    public void enterPassword(String password) throws InterruptedException {
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(3000); // Pause for 3 seconds
    }

    public void clickLogin() throws InterruptedException {
        driver.findElement(loginButton).click();
        Thread.sleep(3000); // Pause for 3 seconds
    }
}
