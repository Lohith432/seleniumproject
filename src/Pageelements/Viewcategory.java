package Pageelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class Viewcategory extends AbstractMethods{
	WebDriver driver;
	
	
    public Viewcategory(WebDriver driverhere) {
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

        // Find the category dropdown and select the desired category
        WebElement categoryDropdown = driver.findElement(By.className("product_sort_container"));
        categoryDropdown.sendKeys("Name (A to Z)");

        // Wait for the products to load
        // You can use explicit wait or add a sleep here if needed

        // Find the product elements and print their names
        List<WebElement> productElements = driver.findElements(By.className("inventory_item_name"));
        for (WebElement productElement : productElements) {
            System.out.println(productElement.getText());
        }

        // Close the browser
        driver.quit();
    }
}
