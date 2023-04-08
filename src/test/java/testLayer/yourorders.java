package testLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;

import pompackage.POMyourorders;

public class yourorders extends BaseAmazonClass{

	POMyourorders yourorders;
public yourorders() {
		
		super();
		
	}
	
@BeforeMethod
public void initsetup() {
	initiation();
	
	 yourorders=new POMyourorders();
	
}

@Test(priority=1)
public void yourorder() {
	yourorders.ordertab();
	String actual=yourorders.verify();
	Assert.assertEquals(actual, "order in the last three months");
	System.out.println("orders placed in past is displayed");
}

@Test(priority=2)
public void cancelledorders() {
	yourorders.canceltab();
	String actual=yourorders.verify();
	Assert.assertEquals(actual, "orders placed in the last 6 months");
	System.out.println("orders placed in last 6 months is displayed");
}
}
