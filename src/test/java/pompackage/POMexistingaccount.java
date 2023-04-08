package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMexistingaccount extends BaseAmazonClass{

	@FindBy(css="#ap_email")WebElement Phonenumber;
	@FindBy(css="#ap_password")WebElement Password;
	@FindBy(css="#continue")WebElement Continuebtn;
	@FindBy(css="#signInSubmit")WebElement Signin;
	
	public POMexistingaccount() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void typePhonenumber (String number) {
		Phonenumber.sendKeys(number);
	}
	public void typePassword (String password) {
		Password.sendKeys(password);
	}
	public void clickbtn() {
		Continuebtn.click();
	}
	public void signin() {
		Signin.click();
	}
	public String verify() {
		return driver.getTitle();
	}

	
}
