package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Finishorder extends AbstractMethods{
	WebDriver driver;

	public Finishorder(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
    @FindBy(xpath ="//a[contains(text(),'FINISH')]")
    WebElement finish;
    
    @FindBy(xpath ="//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement thankyouforyourorder;
    
    public void finish() {
    	implicitlywaitmethod();
    	finish.click();
    	thankyouforyourorder.click();
    }
    public void finish1() {
    	Finishorder fo = new Finishorder(driver);
    }
}
