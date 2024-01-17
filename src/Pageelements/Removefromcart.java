package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageelements.Register;
import utilities.AbstractMethods;

public class Removefromcart extends AbstractMethods {
	WebDriver driver;

	public Removefromcart(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//a[@href='/view_cart']")
//	WebElement cartbtn;

	@FindBy(xpath = "(//button[contains(text(),'REMOVE')]")
	WebElement remove;

	public void removecart() {
		Addproduct ap = new Addproduct(driver);
		
		ap.addproductincart();
//		cartbtn.click();
		System.out.println("Verify that cart page is displayed");
		remove.click();
		System.out.println("Verify that product is removed from the cart");
	}

}
