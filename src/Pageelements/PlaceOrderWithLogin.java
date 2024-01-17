package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class PlaceOrderWithLogin extends AbstractMethods {
	WebDriver driver;
	
	public PlaceOrderWithLogin(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}


	
	
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the inventory page
        driver.get("https://www.saucedemo.com/v1/inventory.html");

        // Find the 'Add to cart' button for the product you want to purchase
        WebElement addToCartButton = driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .btn_inventory"));

        // Click on the 'Add to cart' button
        addToCartButton.click();

        // Find the shopping cart icon and click on it
        WebElement cartIcon = driver.findElement(By.cssSelector(".shopping_cart_link"));
        cartIcon.click();

        // Find the 'Checkout' button and click on it
        WebElement checkoutButton = driver.findElement(By.cssSelector(".checkout_button"));
        checkoutButton.click();

        // Find the input fields for the login information
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        // Enter the login information
        usernameInput.sendKeys("your_username");
        passwordInput.sendKeys("your_password");

        // Find the 'Login' button and click on it
        WebElement loginButton = driver.findElement(By.cssSelector(".btn_action"));
        loginButton.click();

        // Find the 'Continue' button and click on it
        WebElement continueButton = driver.findElement(By.cssSelector(".cart_button"));
        continueButton.click();

        // Find the 'Finish' button and click on it
        WebElement finishButton = driver.findElement(By.cssSelector(".cart_button"));
        finishButton.click();

        // Verify the order completion
        WebElement orderCompleteMessage = driver.findElement(By.cssSelector(".complete-header"));
        if (orderCompleteMessage.isDisplayed()) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Failed to place the order.");
        }

        // Close the browser
        driver.quit();
    }
}


