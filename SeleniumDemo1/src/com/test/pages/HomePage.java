package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

private WebDriver driver;
    
    // Locators
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



	// Methods
    public void openMenu() throws InterruptedException {
        driver.findElement(menuButton).click();
        Thread.sleep(3000); // Pause for 3 seconds
    }

    public void clickLogout() throws InterruptedException {
        driver.findElement(logoutLink).click();
        Thread.sleep(3000); // Pause for 3 seconds
    }
}
