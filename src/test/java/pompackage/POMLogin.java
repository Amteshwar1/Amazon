package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMLogin extends BaseAmazonClass {

	@FindBy(css="#ap_customer_name")WebElement Yourname;
	@FindBy(css="#ap_email") WebElement Mobilenumber;
	@FindBy(css="#ap_password") WebElement Password;
	@FindBy(css="#ap_password_check") WebElement Passwordagain;
	@FindBy(css="#continue") WebElement Continue;
	
	
	public POMLogin() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void typeyourname (String name) {
		Yourname.sendKeys(name);
	}
	public void typemobilenumber(String number) {
		Mobilenumber.sendKeys(number);
	}
	public void typepassword (String pass) {
		Password.sendKeys(pass);
	}
	public void typepasswordagain (String pass) {
		Passwordagain.sendKeys(pass);
	}
	public void clickbtn() {
		Continue.click();
	}
	public String verify() {
		return driver.getTitle();
	}
}
