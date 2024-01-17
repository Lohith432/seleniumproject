package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Utilites.AbstractMethods;

public class VerifyAboutPage extends AbstractMethods {
   WebDriver driver;
    	
		
	public VerifyAboutPage(WebDriver driverhere) {
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

        // Find the 'About' link and click on it
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();

        // Switch to the new tab or window that opens
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Verify if the About page is displayed
        WebElement aboutHeader = driver.findElement(By.cssSelector(".header"));
        if (aboutHeader.getText().equals("About")) {
            System.out.println("About page is displayed!");
        } else {
            System.out.println("About page is not displayed.");
        }

        // Close the new tab or window
        driver.close();

        // Switch back to the original tab or window
        driver.switchTo().window(currentWindowHandle);

        // Close the browser
        driver.quit();
    }
}
