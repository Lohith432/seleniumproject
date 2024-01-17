package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageelements.Addproduct;
import Pageelements.Cartbrand;
import Pageelements.Cartquantity;
import Pageelements.Checkout;
import Pageelements.Filterproducts;
import Pageelements.Finishorder;
import Pageelements.Logindetailspage;
import Pageelements.PlaceOrderWithLogin;
import Pageelements.Productdetailspage;
import Pageelements.Productquantity;
import Pageelements.Removefromcart;
import Pageelements.Scrollupusingarrow;
import Pageelements.Scrollupwithoutarrow;
import Pageelements.VerifyAboutPage;
import Pageelements.Viewcart;
import Pageelements.Viewcategory;
import utilities.Basetest;

public class Signup {
	WebDriver driver;

public Logindetailspage lp;
public Productdetailspage pd;
public VerifyAboutPage vp;
public Cartbrand cb;
public Filterproducts fp;
public PlaceOrderWithLogin po;
public Addproduct ap;
public Removefromcart rc;
public Viewcategory vg;
public Viewcart vc;
public Productquantity pq;
public Cartquantity cq;
public Checkout co;
public Finishorder fo;
public Scrollupusingarrow sa;
public Scrollupwithoutarrow su;


@BeforeTest
public WebDriver intialsebrowser() {
	
	driver = new ChromeDriver();
	return driver;
}


  public void Launchapplication() throws IOException, InterruptedException {
  driver = intialsebrowser(); Thread.sleep(2000);
  driver.get("https://www.saucedemo.com/v1/");
  driver.manage().window().maximize();
  System.out.println("Home page is successfully visibled"); }
 

public class Signuppage extends Basetest{
	 Logindetailspage lp;
  @Test(priority=1)
	public void login() throws IOException, InterruptedException   {
	  driver=intialisebrowser();
	  Thread.sleep(2000);
	driver.get("https://www.saucedemo.com/v1/");
	Logindetailspage lp= new Logindetailspage(driver);
	lp.logindetailspage();
  }
	
	@Test(priority=2)public void Productdetailspage() throws IOException,
	InterruptedException
	{ 
		Productdetailspage pd = new Productdetailspage(driver);
	pd.productdetails();
	}
	
	@Test(priority=3)public void VerifyAboutPage() throws IOException,
	InterruptedException{
		VerifyAboutPage vp = new VerifyAboutPage(driver); 
	vp.VerifyAboutPage();         
	}
	
	@Test(priority=4)public void Cartbrand() throws IOException,
	InterruptedException{ Cartbrand cb = new Cartbrand(driver);cb.cartbrand();
	}
	
	@Test(priority=5)public void Filterproducts() throws IOException,
	InterruptedException{ Filterproducts fp = new Filterproducts(driver);fp.Filterproducts();
	}
	
	@Test(priority=6)public void PlaceOrderWithLogin() throws IOException,
	InterruptedException{PlaceOrderWithLogin po = new PlaceOrderWithLogin(driver);
	po.PlaceOrderWithLogin();
	}
	
	@Test(priority=7)public void Addproduct() throws IOException,
	InterruptedException{ Addproduct ap = new Addproduct(driver);ap.addproductincart();
	}
	
	@Test(priority=8)public void Removefromcart() throws IOException,
	InterruptedException{ Removefromcart rc = new Removefromcart(driver);rc.removecart();
	}
	
	@Test(priority=9)public void Viewcategory() throws IOException,
	InterruptedException{ Viewcategory vg = new Viewcategory(driver);vg.Viewcategory();
	}
	
	@Test(priority=10)public void Viewcart() throws IOException,
	InterruptedException{ Viewcart vc = new Viewcart(driver);vc.Viewcart();
	}
	
	@Test(priority=11)public void Productquantity() throws IOException,
	InterruptedException{ Productquantity pq = new Productquantity(driver);pq.Productquantity;
	}
	
	@Test(priority=12)public void Cartquantity() throws IOException,
	InterruptedException{ Cartquantity cq = new Cartquantity(driver);cq.Cartquantity;
	}
	
	@Test(priority=13)public void Checkout() throws IOException,
	InterruptedException{ Checkout co = new Checkout(driver);co.checkout();
	}
	
	@Test(priority=14)public void Finishorder() throws IOException,
	InterruptedException{ Finishorder fo = new Finishorder(driver);fo.finish();
	}
	
  @Test(priority=15)public void Scrollupusingarrow() throws IOException,
  InterruptedException{ pageelements.Scrollupusingarrow sa = new Scrollupusingarrow(driver);sa.usingarrow();
  }
  
  @Test(priority=16)public void Scrollupwithoutarrow() throws IOException,
  InterruptedException{ pageelements.Scrollupwithoutarrow su = new pageelements.Scrollupwithoutarrow(driver);su.withoutarrow();
  }
	  

		@AfterClass
		public void closebrowser() {
			driver.quit();
  }
  }
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

