package Pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Filterproducts extends AbstractMethods{
	WebDriver driver;

	public Filterproducts(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
    @FindBy(xpath ="//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[3]/select[1]")
    WebElement filterproduct;
    
    public void Filterproducts() {
    	implicitlywaitmethod();
    	Filterproducts.click();
    	System.out.println("Filter products are visible");
    	Filterproducts fp = new Filterproducts(driver);
    	fp.Filterproducts();
    	
    }

	private static void click() {
		Filterproducts fp = new Filterproducts(null);
		fp.Filterproducts();
		
	}
}
