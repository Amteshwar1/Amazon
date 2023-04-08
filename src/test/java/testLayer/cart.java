package testLayer;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.POMcart;

public class cart extends BaseAmazonClass {

POMcart cart;
	
	public cart() {
		
		super();
		
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		cart=new POMcart();
		
	}
	
	@Test(priority=1)
	public void shoppingcart() {
		cart.searchboxs(prop.getProperty("pname"));
		cart.searchbutn();
		cart.productselect();
		cart.cart();
		cart.logo();
		
		String t = "iPhone";

	    if ( driver.getPageSource().contains("iPhone")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	}
	@Test(priority=2)
	public void shoppingcart1() {
		cart.searchboxs(prop.getProperty("pname"));
		cart.searchbutn();
		cart.productselect();
		cart.cart();
		cart.logo();
		cart.quan();
		cart.quans2();
		
		String t = "Subtotal (2 items)";

	    if ( driver.getPageSource().contains("Subtotal (2 items)")){
	       System.out.println("quantity updated");
	    } else {
	       System.out.println("quantity not updated");
	    }
	
	}
	
	@Test(priority=3)
	public void shoppingcart2() {
		cart.searchboxs(prop.getProperty("pname"));
		cart.searchbutn();
		cart.productselect();
		cart.cart();
		cart.logo();
	
		
		String t = "Your Amazon Cart is empty";

	    if ( driver.getPageSource().contains("Your Amazon Cart is empty")){
	       System.out.println("All items deleted");
	    } else {
	       System.out.println("All items not deleted");
	    }
	
	}
	
	@Test(priority=4)
	public void shoppingcart3() {
		cart.searchboxs(prop.getProperty("pname"));
		cart.searchbutn();
		cart.productselect();
		cart.cart();
		cart.logo();
		cart.details();
	
		
		String t = "Product information";

	    if ( driver.getPageSource().contains("Product information")){
	       System.out.println("Product information displayed");
	    } else {
	       System.out.println("Product information is not displayed");
	    }
	
	}
	
	@Test(priority=5)
	public void shoppingcart4() throws InterruptedException {
		cart.searchboxs(prop.getProperty("pname"));
		cart.searchbutn();
		Thread.sleep(3000);
		cart.productselect();
		cart.cart();
		cart.logo();
		driver.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		cart.logo();
		
		
	
		
		String t = "Subtotal (1 item)";

	    if ( driver.getPageSource().contains("Subtotal (1 item)")){
	       System.out.println("same items present when opened");
	    } else {
	       System.out.println("same items not present");
	    }
	
	}
	
}


