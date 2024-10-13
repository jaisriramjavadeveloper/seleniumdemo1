package com.test.shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

	 private WebDriver driver;

	    // Locators
	    private By addToCartButton = By.cssSelector(".btn_inventory");
	    private By cartIcon = By.id("shopping_cart_container");

	    // Constructor
	    public ShoppingCartPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to add all visible items to the cart
	    public void addAllItemsToCart() throws InterruptedException {
	        driver.findElements(addToCartButton).forEach(item -> {
	            try {
	                item.click();
	                Thread.sleep(3000); // Pause for 3 seconds between adding items
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });
	    }

	    // Method to click on the shopping cart icon
	    public void goToCart() throws InterruptedException {
	        driver.findElement(cartIcon).click();
	        Thread.sleep(3000); // Pause for 3 seconds
	    }
}
