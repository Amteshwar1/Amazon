package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMfilter extends BaseAmazonClass {

	@FindBy(css="#twotabsearchtextbox")WebElement searchbar;
	@FindBy(css="#nav-search-submit-button")WebElement searchbtn;
	
	
	
	
	public POMfilter() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void typeinsearch (String pn) {
		searchbar.sendKeys(pn);
	}
	public void searchbutton() {
		searchbtn.click();
	}
	
	public String verify() {
		return driver.getTitle();
	}
	
	
}
