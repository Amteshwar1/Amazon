package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMsorting extends BaseAmazonClass {

	@FindBy(css="#a-autoid-7-announce > span.a-dropdown-prompt")WebElement sorttab;
	@FindBy(css="#s-result-sort-select_1")WebElement lowtohigh;
	@FindBy(css="#twotabsearchtextbox")WebElement searchbar;
	@FindBy(css="#nav-search-submit-text")WebElement searchbtn;
	

	public POMsorting() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void sorttabs() {
		sorttab.click();
	}
	public void lowtohighsort() {
		lowtohigh.click();
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
