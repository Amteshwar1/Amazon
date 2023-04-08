package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMsearching extends BaseAmazonClass {

	@FindBy(css="#twotabsearchtextbox")WebElement searchbar;
	@FindBy(css="#nav-search-submit-button")WebElement searchbtn;
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t3.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")WebElement productdetail;
	
	

	public POMsearching() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void typepname (String pname) {
		searchbar.sendKeys(pname);
	}
	public void typepartialname (String prname) {
		searchbar.sendKeys(prname);
	}

	public void typeitemname (String itemname) {
		searchbar.sendKeys(itemname);
	}
	
	public void typecategoryname (String category) {
		searchbar.sendKeys(category);
	}
	public void productdetails() {
		productdetail.click();
	}
	public void clickbtn() {
		searchbtn.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
}
