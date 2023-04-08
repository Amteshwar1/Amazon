package testLayer;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;

import pompackage.POMsorting;

public class sorting extends BaseAmazonClass {

POMsorting sorting;
	
	public sorting() {
		
		super();
		
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		sorting=new POMsorting();
		
	}
	@Test(priority=1)
	public void sortingfunc() throws InterruptedException {
		sorting.typeinsearch(prop.getProperty("productname"));
		Thread.sleep(3000);
		sorting.sorttabs();
		sorting.sorttabs();
		
		String t = "Price: Low to high";

	    if ( driver.getPageSource().contains("Price: Low to high")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
		
	}
	
	
	@Test(priority=2)
	public void sortingfunc1() throws InterruptedException {
		sorting.typeinsearch(prop.getProperty("productname"));
		Thread.sleep(3000);
		sorting.sorttabs();
		sorting.sorttabs();
		
		String t = "Price: High to low";

	    if ( driver.getPageSource().contains("Price: High to low")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
		
	}
	@Test(priority=3)
	public void sortingfunc2() throws InterruptedException {
		sorting.typeinsearch(prop.getProperty("productname"));
		Thread.sleep(3000);
		sorting.sorttabs();
		sorting.sorttabs();
		
		String t = "Popular";

	    if ( driver.getPageSource().contains("Popular")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
		
	}
	@Test(priority=4)
	public void sortingfunc3() throws InterruptedException {
		sorting.typeinsearch(prop.getProperty("productname"));
		Thread.sleep(3000);
		sorting.sorttabs();
		sorting.sorttabs();
		
		String t = "Newest arrivals";

	    if ( driver.getPageSource().contains("Newest arrivals")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
		
	}
	@Test(priority=5)
	public void sortingfunc4() throws InterruptedException {
		sorting.typeinsearch(prop.getProperty("productname"));
		Thread.sleep(3000);
		sorting.sorttabs();
		sorting.sorttabs();
		
		String t = "Avg. customer reviews";

	    if ( driver.getPageSource().contains("Avg. customer reviews")){
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
