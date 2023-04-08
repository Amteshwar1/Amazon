package testLayer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;

import pompackage.POMyouraccount;

public class youraccount extends BaseAmazonClass {
	POMyouraccount youraccount;
	public youraccount() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
			youraccount=new POMyouraccount();
		
	}
	@Test(priority=1)
	public void yours() {
		String actual=youraccount.verify();
		Assert.assertEquals(actual, "Hello, amteshwar");
		
	}
		
	
	@Test(priority=2)
	public void your() {
		youraccount.clickbtn();
		String actual=youraccount.verify();
		Assert.assertEquals(actual, "Your orders");
		System.out.println("Your order tab is open");
	}
	
}
