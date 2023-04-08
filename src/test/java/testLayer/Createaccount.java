package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.POMLogin;

public class Createaccount extends BaseAmazonClass {

	POMLogin Log;
	
	public Createaccount() {
		
		super();
		
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		Log=new POMLogin();
		
	}
	@Test(priority=1)
	public void Title() {
		String actual=Log.verify();
		Assert.assertEquals(actual, "Amazon.ca");
		
	}
	@Test(priority=2)
	public void Login() {
		Log.typeyourname(prop.getProperty("username"));
		Log.typemobilenumber(prop.getProperty("mobilenumber"));
		Log.typepassword(prop.getProperty("password"));
		Log.typepasswordagain(prop.getProperty("passwordagain"));
		Log.clickbtn();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}
