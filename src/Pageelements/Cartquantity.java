package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Cartquantity extends AbstractMethods{
	WebDriver driver;
	public Cartquantity(WebDriver driverhere) {
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

        // Find the 'Add to cart' buttons for the products you want to add
        WebElement addToCartButton1 = driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .btn_inventory"));
        WebElement addToCartButton2 = driver.findElement(By.cssSelector(".inventory_item:nth-child(2) .btn_inventory"));
        // Add more buttons as needed

        // Click on the 'Add to cart' buttons
        addToCartButton1.click();
        addToCartButton2.click();
        // Click on more buttons as needed

        // Find the shopping cart icon and click on it
        WebElement cartIcon = driver.findElement(By.cssSelector(".shopping_cart_link"));
        cartIcon.click();

        // Find the quantity of products in the cart
        WebElement cartQuantity = driver.findElement(By.cssSelector(".shopping_cart_badge"));

        // Verify the quantity of products in the cart
        int quantity = Integer.parseInt(cartQuantity.getText());
        if (quantity == 2) {
            System.out.println("Correct quantity of products in the cart: " + quantity);
        } else {
            System.out.println("Incorrect quantity of products in the cart: " + quantity);
        }

        // Close the browser
        driver.quit();
    }
}
