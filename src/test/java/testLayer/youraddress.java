package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.POMyouraddress;

public class youraddress extends BaseAmazonClass{
POMyouraddress address;
public youraddress() {
		
		super();
		
	}

@BeforeMethod
public void initsetup() {
	initiation();
	
	address=new POMyouraddress();
	
}

@Test(priority=1)
public void address() {
	address.clickaddresstab();
	String actual=address.verify();
	Assert.assertEquals(actual, "Your Addresses");
	System.out.println("add address option is displayed");
}
@Test(priority=2)
public void address1() {
	address.clickaddresstab();
	address.clickbtn();
	String actual=address.verify();
	Assert.assertEquals(actual, "Add a new address");
	System.out.println("adress window is opened");
}

@Test(priority=3)
public void address2() {
	address.clickaddresstab();
	address.clickbtn();
	String t = "Make this my default address";

    if ( driver.getPageSource().contains("Make this my default address")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
 }

@Test(priority=4)
public void address3() {
	address.clickaddresstab();
	address.clickbtn();
	String t = "Delivery instructions";

    if ( driver.getPageSource().contains("Delivery instructions")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
	
}

@Test(priority=5)
public void address4() {
	address.clickaddresstab();
	address.clickbtn();
	address.typefullname(prop.getProperty("fullname"));
	address.typephonenumber(prop.getProperty("phonenumber"));
	address.typeaddress(prop.getProperty("address"));
	address.typecity(prop.getProperty("city"));
	address.typepostal(prop.getProperty("postalcode"));
	address.clicklast();
	
	String t = "Delivery instructions";

    if ( driver.getPageSource().contains("Suggested Address")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
	
}
@Test(priority=6)
public void address5() {
	address.clickaddresstab();
	address.clickbtn();
	address.typefullname(prop.getProperty("fullname"));
	address.typephonenumber(prop.getProperty("phonenumber"));
	address.typeaddress(prop.getProperty("address"));
	address.typecity(prop.getProperty("city"));
	address.typepostal(prop.getProperty("postalcode"));
	address.clicklast();
address.suggestedaddress();
address.saveaddress();

String t = "Address saved";

if ( driver.getPageSource().contains("Address saved")){
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




