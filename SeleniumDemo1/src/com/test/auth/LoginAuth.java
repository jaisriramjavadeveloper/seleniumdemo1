package com.test.auth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.pages.HomePage;
import com.test.pages.LoginPage;

public class LoginAuth {
	 public static void main(String[] args) throws InterruptedException {
	       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	    	System.setProperty("webdriver.chrome.driver","F:\\1JavaWorkspace\\sriramArunaGitRepos\\SeleniumRepos\\SeleniumAutomation1\\SeleniumDemo1\\drivers\\chromedriver.exe");

	        // Users and password
	        String[] usernames = {
	            "standard_user",
	            "locked_out_user",
	            "problem_user",
	            "performance_glitch_user",
	            "visual_user"
	        };
	        String password = "secret_sauce";

	        for (String username : usernames) {
	            WebDriver driver = new ChromeDriver();
	            try {
	                driver.get("https://www.saucedemo.com/");
	                driver.manage().window().maximize();

	                // Create page objects
	                LoginPage loginPage = new LoginPage(driver);
	                HomePage homePage = new HomePage(driver);

	                // Perform login
	                System.out.println("Testing login for: " + username);
	                loginPage.enterUsername(username);
	                loginPage.enterPassword(password);
	                loginPage.clickLogin();

	                // Perform logout (if login is successful)
	                homePage.openMenu();
	                homePage.clickLogout();

	            } catch (Exception e) {
	                System.out.println("Error during testing user: " + username);
	                e.printStackTrace();
	            } finally {
	                driver.quit();
	                System.out.println("Completed test for: " + username + "\n");
	            }
	        }
	 }
}
