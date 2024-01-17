package Utilites;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;



public class Basetest {
	
	public WebDriver driver;
	@BeforeClass
	public WebDriver intialisebrowser() {
		
		driver = new ChromeDriver();
		return driver;
	
	}
	/*@AfterTest
//	public void closedriver() {
		driver.quit();*/
	}
	

