package Pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Logindetailspage extends AbstractMethods {

	WebDriver driver;

	public Logindetailspage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;

	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement submitbutton;

	/*
	 * @FindBy(xpath = "//a[@href='/delete_account']") WebElement deleteaccount;
	 */
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logout;

	public void logindetailspage() throws InterruptedException {
		implicitlywaitmethod();
		username.sendKeys("problem_user");
		Password.sendKeys("secret_sauce");
		submitbutton.sendKeys(Keys.ENTER);
		System.out.println("'Logged in as username' is visible");
	}

	public void delaccount() {
		implicitlywaitmethod();
		logout.click();
		/*
		 * deleteaccount.click(); System.out.println("'ACCOUNT DELETED!' is visible ");
		 */

	}
}