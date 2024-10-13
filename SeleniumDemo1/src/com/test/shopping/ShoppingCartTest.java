package com.test.shopping;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.pages.LoginPage;


public class ShoppingCartTest {
	public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		System.setProperty("webdriver.chrome.driver","F:\\1JavaWorkspace\\sriramArunaGitRepos\\SeleniumRepos\\SeleniumAutomation1\\SeleniumDemo1\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            // Create page objects
            LoginPage loginPage = new LoginPage(driver);
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
            CheckoutPage checkoutPage = new CheckoutPage(driver);

            // Perform login as standard_user
            loginPage.enterUsername("standard_user");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickLogin();

            // Add all items to the cart and navigate to cart
            shoppingCartPage.addAllItemsToCart();
            shoppingCartPage.goToCart();

            // Proceed to checkout and complete the purchase
            checkoutPage.proceedToCheckout();
            checkoutPage.enterUserInfo("John", "Doe", "12345");
            checkoutPage.completeCheckout();
            checkoutPage.returnToHomePage();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Shopping cart test completed.");
        }
    }
}
