package com.test.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	private WebDriver driver;

    // Locators
    private By checkoutButton = By.id("checkout");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By backToHomeButton = By.id("back-to-products");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to proceed to checkout
    public void proceedToCheckout() throws InterruptedException {
        driver.findElement(checkoutButton).click();
        Thread.sleep(3000); // Pause for 3 seconds
    }

    // Method to enter user information
    public void enterUserInfo(String firstName, String lastName, String postalCode) throws InterruptedException {
        driver.findElement(firstNameField).sendKeys(firstName);
        Thread.sleep(3000);
        driver.findElement(lastNameField).sendKeys(lastName);
        Thread.sleep(3000);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        Thread.sleep(3000);
    }

    // Method to complete the checkout
    public void completeCheckout() throws InterruptedException {
        driver.findElement(continueButton).click();
        Thread.sleep(3000);
        driver.findElement(finishButton).click();
        Thread.sleep(3000);
    }

    // Method to return to the home page
    public void returnToHomePage() throws InterruptedException {
        driver.findElement(backToHomeButton).click();
        Thread.sleep(3000);
    }
}
