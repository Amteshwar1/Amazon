package testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseAmazonClass;
import pompackage.POMshoppingcart;

public class Shoppingcart extends BaseAmazonClass {

POMshoppingcart Cart;
Actions action;
	public Shoppingcart() {
		
		super();
		
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		Cart=new POMshoppingcart();
		action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		driver.findElement(By.cssSelector("#nav-link-accountList")).click();
	}
	
	@Test(priority = 1)
	public void validShoppingCartButton() {

		action.moveToElement(driver.findElement(By.cssSelector("#nav-cart"))).build().perform();
		driver.findElement(By.cssSelector("#nav-cart")).click();

		String expectedTitle = "Amazon.ca Shopping Cart";
		String actualTitle = Cart.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2)

	public void validAddtocartButton() {

		action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).build().perform();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		Cart.Searchbar("AirPurifier");
		driver.findElement(By.id("nav-search-submit-button")).click();

		action.moveToElement(driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img")))
				.build().perform();
		driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img"))
				.click();

		driver.findElement(By.id("add-to-cart-button")).click();
		action.moveToElement(driver.findElement(By.cssSelector("#sc-buy-box-ptc-button > span > input"))).build()
				.perform();
		driver.findElement(By.cssSelector("#sc-buy-box-ptc-button > span > input")).click();

		String expectedTitle = "Select a shipping address";
		String actualTitle = Cart.provideTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 3)
	public void addingmultipleitemstocart() {
		action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).build().perform();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		Cart.Searchbar("AirPurifier");
		driver.findElement(By.id("nav-search-submit-button")).click();
		action.moveToElement(driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img")))
				.build().perform();
		driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(6) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a > div > img"))
				.click();

		driver.findElement(By.id("add-to-cart-button")).click();

		action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).build().perform();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		Cart.Searchbar("Bluetooth Speaker");
		driver.findElement(By.id("nav-search-submit-button")).click();
		action.moveToElement(driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(27) > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a")))
				.build().perform();
		driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(27) > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a"))
				.click();
		driver.findElement(By.id("add-to-cart-button")).click();

		action.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).build().perform();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		Cart.Searchbar("French Dictionary");
		driver.findElement(By.id("nav-search-submit-button")).click();
		action.moveToElement(driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a")))
				.build().perform();
		driver.findElement(By.cssSelector(
				"#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > span > a"))
				.click();
		driver.findElement(By.id("add-to-cart-button")).click();

		action.moveToElement(driver.findElement(By.cssSelector("#nav-cart"))).build().perform();
		driver.findElement(By.cssSelector("#nav-cart")).click();

	}

	@Test(priority = 4)
	public void DeselectAllItemsFromCart() {
		action.moveToElement(driver.findElement(By.cssSelector("#nav-cart"))).build().perform();
		driver.findElement(By.cssSelector("#nav-cart")).click();

		action.moveToElement(driver.findElement(By.cssSelector("#deselect-all"))).build().perform();
		driver.findElement(By.cssSelector("#deselect-all")).click();
	}

	@Test(priority = 5)
	public void SelectAllItemsFromCart() {
		action.moveToElement(driver.findElement(By.cssSelector("#nav-cart"))).build().perform();
		driver.findElement(By.cssSelector("#nav-cart")).click();

		action.moveToElement(driver.findElement(By.cssSelector("#select-all"))).build().perform();
		driver.findElement(By.cssSelector("#select-all")).click();

	}

	@Test(priority = 6)
	public void ReopeningBrowserToCheckTheCart() {
		action.moveToElement(driver.findElement(By.cssSelector("#nav-cart"))).build().perform();
		driver.findElement(By.cssSelector("#nav-cart")).click();
	}

	@Test(priority = 7)
	public void ValidQuantityDropdownmenu() {
		action.moveToElement(driver.findElement(By.cssSelector("#nav-cart"))).build().perform();
		driver.findElement(By.cssSelector("#nav-cart")).click();

		action.moveToElement(driver.findElement(By.cssSelector(
				"#sc-active-Cbe87afdd-7979-493f-a876-5429d17564f2 > div.sc-list-item-content > div > div:nth-child(3) > div.a-row.sc-action-links > span.sc-action-quantity > span > span:nth-child(1)")))
				.build().perform();
		driver.findElement(By.cssSelector(
				"#sc-active-Cbe87afdd-7979-493f-a876-5429d17564f2 > div.sc-list-item-content > div > div:nth-child(3) > div.a-row.sc-action-links > span.sc-action-quantity > span > span:nth-child(1)"))
				.click();
		Select obj = new Select(driver.findElement(By.cssSelector(
				"#sc-active-Cbe87afdd-7979-493f-a876-5429d17564f2 > div.sc-list-item-content > div > div:nth-child(3) > div.a-row.sc-action-links > span.sc-action-quantity > span > span:nth-child(1)\")).click();\r\n")));
		obj.selectByVisibleText("2");

	}

	@AfterMethod
	public void close() {
		driver.close();
	}

	
	
}
