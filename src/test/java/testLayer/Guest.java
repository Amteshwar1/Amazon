package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.POMLogin;
import pompackage.POMguest;

public class Guest extends BaseAmazonClass {

	POMguest guest;
	
public Guest() {
		
		super();
		
	}

@BeforeMethod
public void initsetup() {
	initiation();
	
	guest=new POMguest();
	
}

@Test
public void guestbuy() {
	guest.category();
	guest.product();
	guest.buy();
	
	String t = "Place your order";

    if ( driver.getPageSource().contains("Place your order")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
	
}



}
