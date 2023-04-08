package testLayer;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;

import pompackage.POMexistingaccount;

public class existingaccount extends BaseAmazonClass {
	
	POMexistingaccount exist;
	
	public existingaccount() {
		super();
	}
	
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		exist=new POMexistingaccount();
		
	}
	
	@Test
	public void Existing() {
		exist.typePhonenumber(prop.getProperty("Phonenumber"));
		exist.clickbtn();
		exist.typePassword(prop.getProperty("Password"));
		exist.signin();
	}
		
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
	
	
	
	
}
