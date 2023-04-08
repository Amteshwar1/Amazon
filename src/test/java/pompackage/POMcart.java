package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMcart extends BaseAmazonClass {

	@FindBy(css="#twotabsearchtextbox")WebElement searchbox;
	@FindBy(css="#nav-search-submit-button")WebElement searchbtn;
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t3.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")WebElement product;
	@FindBy(css="#add-to-cart-button")WebElement addtocart;
	@FindBy(css="#nav-cart-count-container > span.nav-cart-icon.nav-sprite")WebElement cartlogo;
	@FindBy(css="#a-autoid-1-announce > span.a-dropdown-label")WebElement quantity;
	@FindBy(css="#quantity_2")WebElement quan2;
	@FindBy(css="#sc-active-Cc18f0685-4a4f-457e-a6cd-36ec27c0a0c7 > div.sc-list-item-content > div > div:nth-child(2) > div.a-row.sc-action-links > span.a-size-small.sc-action-delete > span > input")WebElement delete;
	@FindBy(css="#sc-active-C2692bba1-45c3-4d58-9039-c7d5d085d7ba > div.sc-list-item-content > div > div:nth-child(2) > ul > li.a-spacing-mini > span > a > span.a-size-base-plus.a-color-base.sc-product-title.sc-grid-item-product-title > span > span.a-truncate-cut")WebElement productdetail;
	public POMcart() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchboxs (String name) {
		searchbox.sendKeys(name);
	}
	public void searchbutn() {
		searchbtn.click();
	}
	public void productselect () {
		product.click();
	}
	public void cart() {
		addtocart.click();
	}
	public void logo() {
		cartlogo.click();
	}
	public void quan() {
		quantity.click();
	}
	public void quans2() {
		quan2.click();
	}
	public void deletebtn() {
		delete.click();
	}
	public void details() {
		productdetail.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
	
	
	
}
