package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMpayment extends BaseAmazonClass {
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")WebElement paymenttab;
	@FindBy(css="#pp-By3Uvs-20")WebElement addpayment;
	@FindBy(css="#pp-u1wv19-32 > span > input")WebElement debitorcredit;
	
	
	public POMpayment() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void paymenttabs() {
		paymenttab.click();
	}
	
	public void addpayments() {
		addpayment.click();
		
	}
	public void debitorcredits() {
		debitorcredit.click();
	}
	
	
	
}
