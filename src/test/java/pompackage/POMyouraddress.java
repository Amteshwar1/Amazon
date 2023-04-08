package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMyouraddress extends BaseAmazonClass {

	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")WebElement youraddresstab;
	@FindBy(css="#ya-myab-address-add-link > div > div")WebElement addaddresstab;
	@FindBy(css="#address-ui-widgets-countryCode > span > span")WebElement country;
	@FindBy(css="#address-ui-widgets-enterAddressFullName")WebElement fullname;
	@FindBy(css="#address-ui-widgets-enterAddressPhoneNumber")WebElement phonenumber;
	@FindBy(css="#address-ui-widgets-enterAddressLine1")WebElement address;
	@FindBy(css="#address-ui-widgets-enterAddressCity")WebElement city;
	@FindBy(css="#address-ui-widgets-enterAddressPostalCode")WebElement postalcode;
	@FindBy(css="#address-ui-widgets-form-submit-button > span > input")WebElement addaddressbutton;
	@FindBy(css= "#address-ui-widgets-suggested-address-block_id-outer > label > span > div > span")WebElement suggested;
	@FindBy(css="#a-autoid-2 > span > input")WebElement saveaddress;
	public POMyouraddress() {
		PageFactory.initElements(driver, this);
		
	}
	public void typefullname (String name) {
		fullname.sendKeys(name);
	}
	public void typephonenumber(String number) {
		phonenumber.sendKeys(number);
	}
	public void typeaddress (String name) {
		address.sendKeys(name);
	}
	public void typecity(String name) {
		city.sendKeys(name);
	}
	public void typepostal(String name) {
		postalcode.sendKeys(name);
	}
	
	public void clickbtn() {
		addaddresstab.click();
	}
	
	public void clickaddresstab() {
		youraddresstab.click();
	}
	public void clicklast() {
		addaddressbutton.click();
	}
	public void suggestedaddress() {
		suggested.click();
	}
	public void saveaddress() {
		saveaddress.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
}
