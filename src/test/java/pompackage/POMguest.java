package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMguest extends BaseAmazonClass {

	@FindBy(css="#nav-xshop > a:nth-child(2)")WebElement bestseller;
	@FindBy(css="#B08BRV6S41 > a:nth-child(2) > span > div")WebElement productselect;
	@FindBy(css="#buy-now-button")WebElement buynow;
	
	
	
	public POMguest() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void category () {
		bestseller.click();
	}
	public void product() {
		productselect.click();
	}
	public void buy() {
		buynow.click();
	}
	
	public String verify() {
		return driver.getTitle();
	}
	
	
	
}
