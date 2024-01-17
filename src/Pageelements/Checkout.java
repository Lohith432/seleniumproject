package Pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageelements.Register;
import pageelements.Registerwhilecheckout;
import utilities.AbstractMethods;

public class Checkout extends AbstractMethods {
	WebDriver driver;
	

	public Checkout(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;
	
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement enterfirstname;
	
	@FindBy(xpath = "//input[@id='lastname'])[2]")
	WebElement enterlastname;
	
	@FindBy(xpath = "//input[@//input[@id='postal-code']")
	WebElement enterzipcode;
	
	@FindBy(xpath = "//button[@//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[1]/form[1]/div[2]/input[1]")
	WebElement entercontinue;
	
	public void checkout() {
		implicitlywaitmethod();
		login.click();
		enterfirstname.sendKeys("lohith");
		enterlastname.sendKeys("l");
		enterzipcode.sendKeys("517247");
		entercontinue.sendKeys(Keys.ENTER);
		
		entercontinue.click();
		System.out.println("Logged name is visible");
		Addproduct ap = new Addproduct(driver);
		ap.addproductincart();
	}
	public void proceed() {
		Registerwhilecheckout rc = new Registerwhilecheckout(driver);
		rc.proceedbtn();
	
	
		
	}

}
