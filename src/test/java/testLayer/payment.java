package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.POMpayment;

public class payment extends BaseAmazonClass {
POMpayment payment;
	
public payment() {
		
		super();
		
	}

@BeforeMethod
public void initsetup() {
	initiation();
	
	payment=new POMpayment();
	
}

@Test(priority=1)
public void addpaymentmethod() {
	payment.paymenttabs();
	String t = "Add a payment method";

    if ( driver.getPageSource().contains("Add a payment method")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
}
@Test(priority=2)
public void defaultpaymentmethod() {
	payment.paymenttabs();
	payment.debitorcredits();
	
	String t = "choose default payment method";

    if ( driver.getPageSource().contains("choose default payment method")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
}

}
