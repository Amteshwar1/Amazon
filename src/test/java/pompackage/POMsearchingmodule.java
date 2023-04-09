package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMsearchingmodule extends BaseAmazonClass {

	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchAmazon;
	
	@FindBy(id="nav-search-submit-button")
	WebElement Searchsubmit;
	
	@FindBy (id="searchDropdownBox")
	WebElement All;
	
	@FindBy (className="s-result-sort-select")
	WebElement Sortby;
	
	@FindBy (id="s-result-sort-select_4")
	WebElement NewestArrivals;

	public POMsearchingmodule() {
		PageFactory.initElements(driver, this);
		
	}

	public void Searchbar(String Search) {
		SearchAmazon.sendKeys(Search);
	}

	public void Searchsubmit() {
		Searchsubmit.click();
	}
	public void All() {
		All.click();
	}
	public void Next() {
		Sortby.click();
	}
	public void NewestArrivals() {
		NewestArrivals.click();
	}
	public String provideTitle() {
		
		return driver.getTitle();
	}
}
