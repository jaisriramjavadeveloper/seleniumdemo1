package com.test.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\1JavaWorkspace\\sriramArunaGitRepos\\SeleniumRepos\\SeleniumAutomation1\\SeleniumDemo1\\drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	        try {
	            driver.get("https://www.saucedemo.com/");
	            driver.manage().window().maximize();

	            // Create a WebDriverWait object with a timeout of 10 seconds
	            Duration seconds = Duration.ofSeconds(20);
	          
	            WebDriverWait wait =  new WebDriverWait(driver, seconds.getSeconds());    // new WebDriverWait(driver, Duration.ofSeconds(10));
	            

	            // Wait for the username field to be visible and enter the username
	            WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
	            username.sendKeys("standard_user");
	            Thread.sleep(5000);

	            // Wait for the password field to be visible and enter the password
	            WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	            password.sendKeys("secret_sauce");
	            Thread.sleep(5000);


	            // Wait for the login button to be clickable and click it
	            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
	            loginButton.click();
	            Thread.sleep(5000);
	        


	            // Wait for the menu button to be visible after login
	            WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
	            menuButton.click();
	            Thread.sleep(5000);

	            // Wait for the logout link to be visible and click it
	            WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
	            logoutLink.click();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	
	  
	
	}

}
