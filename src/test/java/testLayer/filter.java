package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.POMfilter;

public class filter extends BaseAmazonClass {

	POMfilter filter;
	
	public filter() {
		
		super();
		
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		filter=new POMfilter();
		
	}
	
	@Test(priority=1)
	public void filters() {
		filter.typeinsearch(prop.getProperty("productname"));
		filter.searchbutton();
		
		String t = "Customer Review";

	    if ( driver.getPageSource().contains("Customer Review")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
		
	}
	
	@Test(priority=2)
	public void filters1() {
		filter.typeinsearch(prop.getProperty("productname"));
		filter.searchbutton();
		
		String t = "Availability";

	    if ( driver.getPageSource().contains("Availability")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	}
	
	@Test(priority=3)
	public void filters2() {
		filter.typeinsearch(prop.getProperty("productname"));
		filter.searchbutton();
		
		String t = "Online Saving";

	    if ( driver.getPageSource().contains("Online Saving")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	}
	
	@Test(priority=4)
	public void filters3() {
		filter.typeinsearch(prop.getProperty("productname"));
		filter.searchbutton();
		
		String t = "Best Seller";

	    if ( driver.getPageSource().contains("Best Seller")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	}
	
	@Test(priority=5)
	public void filters4() {
		filter.typeinsearch(prop.getProperty("productname"));
		filter.searchbutton();
		
		String t = "Brand";

	    if ( driver.getPageSource().contains("Brand")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	}	
	
	@Test(priority=6)
	public void filters5() {
		filter.typeinsearch(prop.getProperty("productname"));
		filter.searchbutton();
		
		String t = "Price";

	    if ( driver.getPageSource().contains("Price")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	}
	
	@Test(priority=7)
	public void filters6() {
		filter.typeinsearch(prop.getProperty("productname"));
		filter.searchbutton();
		
		String t = "Sold and Shipped by";

	    if ( driver.getPageSource().contains("Sold and Shipped by")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}
