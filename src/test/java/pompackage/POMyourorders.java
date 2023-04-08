package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class POMyourorders extends BaseAmazonClass{

	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")WebElement yourorders;
	@FindBy(css="#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a")WebElement buyagain;
	@FindBy(css="#CardInstanceZXbd_ciF1ghJ66t-2c-vmA > div > div:nth-child(3) > ul > li:nth-child(3) > span > a")WebElement notyetshipped;
	@FindBy(css="#CardInstanceZXbd_ciF1ghJ66t-2c-vmA > div > div:nth-child(3) > ul > li:nth-child(4) > span > a")WebElement cancelledorders;
	
	public POMyourorders() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void ordertab() {
		yourorders.click();
	}
	
	public void canceltab() {
		cancelledorders.click();
	}
	
	public String verify() {
		return driver.getTitle();
	}
}
