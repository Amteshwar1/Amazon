package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.POMsearching;

public class searching extends BaseAmazonClass {

	POMsearching searching;
	
	public searching() {
		
		super();
		
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		searching=new POMsearching();
		
	}
	
	@Test(priority=1)
	public void searching0() {
		searching.typepname(prop.getProperty("pname"));
		searching.clickbtn();
		
		String t = "iphone";

	    if ( driver.getPageSource().contains("iphone")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	 }
	
	@Test(priority=2)
	public void searching1() {
		searching.typepname(prop.getProperty("pname"));
		searching.clickbtn();
		
		String t = "ipho";

	    if ( driver.getPageSource().contains("iphone")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	 }
	
	@Test(priority=3)
	public void searching2() {
		searching.typepname(prop.getProperty("pname"));
		searching.clickbtn();
		
		String t = "iphone 11";

	    if ( driver.getPageSource().contains("iphone 11")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	 }
	@Test(priority=4)
	public void searching3() {
		searching.typepname(prop.getProperty("pname"));
		searching.clickbtn();
		
		String t = "smartwatch";

	    if ( driver.getPageSource().contains("smartwatch")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	 }
	
	@Test(priority=5)
	public void searching4() {
		searching.typepname(prop.getProperty("pname"));
		searching.clickbtn();
		searching.productdetails();
		
		String t = "iphone";

	    if ( driver.getPageSource().contains("smartwatch")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
	 }
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@Test(priority=6)
	public void searching5() {
		searching.typepname(prop.getProperty("pname"));
		searching.clickbtn();
		
		String t = "1-48 of over";

	    if ( driver.getPageSource().contains("1-60 of over")){
	       System.out.println("page display 60 results");
	    } else {
	       System.out.println("page does not display 60 results ");
	    }
	 }
	
	
	
	
	
	
	
}
