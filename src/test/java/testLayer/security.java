package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.Pomsecurity;

public class security extends BaseAmazonClass {
Pomsecurity security;
	
public security() {
		
		super();
		
	}

@BeforeMethod
public void initsetup() {
	initiation();
	
	security=new Pomsecurity();
	
}

@Test(priority=1)
public void logsecurity() {
	security.securitytab();
	security.editname();
	security.typenewname(prop.getProperty("newname"));
	security.savechange();
	
	String t = "You successfully changed your account!";

    if ( driver.getPageSource().contains("You successfully changed your account!")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
}

@Test(priority=2)
public void logsecurity1() {
	security.securitytab();
	security.editemail();
	security.typenewemail(prop.getProperty("new email"));
	security.clickbtn();
	
	String t = "You successfully changed your account!";

    if ( driver.getPageSource().contains("You successfully changed your account!")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
}




}
