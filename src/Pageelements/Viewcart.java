package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Viewcart extends AbstractMethods {
	WebDriver driver;

	public Viewcart(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/view_cart']")
    WebElement cartbtn;

	@FindBy(xpath="//button[contains(text(),'REMOVE')]")
    WebElement remove;
	
	@FindBy(xpath="//a[contains(text(),'Continue Shopping')]']")
    WebElement continueshopping;
	
	@FindBy(xpath="//a[contains(text(),'CHECKOUT')]")
    WebElement checkout;
	
	public void subCartpage() {
		implicitlywaitmethod();
		cartbtn.click();
		remove.click();
		System.out.println("Verify text 'SUBSCRIPTION'");
		continueshopping.sendKeys();
		checkout.click();
		System.out.println("'You have been successfully subscribed!' is visible");
	}

	public void Viewcart() {
		// TODO Auto-generated method stub
		
	}

}
