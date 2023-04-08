package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMyouraccount extends BaseAmazonClass {

	@FindBy(css="#nav-link-accountList-nav-line-1")WebElement Hellomsg;
	@FindBy(css="#nav-link-accountList > span")WebElement Accounts;
	
	public POMyouraccount() {
		PageFactory.initElements(driver, this);
		
	}
	public void clickbtn() {
		Accounts.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
}
