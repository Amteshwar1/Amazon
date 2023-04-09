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

public class searchingmodule extends BaseAmazonClass {

	POMshoppingcart searching;
	Actions action;
		public searchingmodule() {
			
			super();
			
		}
		
		@BeforeMethod
		public void initsetup() {
			initiation();
			
			searching=new POMshoppingcart();
			

			action = new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
			driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		}
		
		@Test(priority = 1)
		public void validAllbutton() {

			action.moveToElement(driver.findElement(By.id("searchDropdownBox"))).build().perform();
			driver.findElement(By.id("searchDropdownBox")).click();
			screenshots("Search Module1");

		}

		@Test(priority = 2) 
		public void validSearchKEYWORD() throws InterruptedException {

			action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			searching.Searchbar("Yogamats");
			driver.findElement(By.id("nav-search-submit-button")).click();

			String ExpectedTitle = "Amazon.ca : Yogamats";
			String actualTitle = searching.provideTitle();
			Assert.assertEquals(actualTitle, ExpectedTitle);
			System.out.print(actualTitle);

			Thread.sleep(5000); 
			screenshots("Search Module2");
		}
	    
		@Test(priority = 3) 
		public void validSearchDESCRIPTIONTEXT() throws InterruptedException {

			action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			searching.Searchbar("bluetooth headphones");
			driver.findElement(By.id("nav-search-submit-button")).click();

			String ExpectedTitle = "Amazon.ca : bluetooth headphones";
			String actualTitle = searching.provideTitle();
			Assert.assertEquals(actualTitle, ExpectedTitle);
			System.out.print(actualTitle);
			Thread.sleep(5000);
			screenshots("Search Module3");
		}

		@Test(priority = 4) 
		public void validSearchMODELNO() throws InterruptedException {

			action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			searching.Searchbar("LOGITECH H111");
			driver.findElement(By.id("nav-search-submit-button")).click();

			String ExpectedTitle = "Amazon.ca : LOGITECH H111";
			String actualTitle = searching.provideTitle();
			Assert.assertEquals(actualTitle, ExpectedTitle);
			System.out.print(actualTitle);
			Thread.sleep(5000);
			screenshots("Search Module4");
		}

		@Test(priority = 5) 
		public void validSearchPARTIALMODELNO() throws InterruptedException {

			action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			searching.Searchbar("LOGITECH H1");
			driver.findElement(By.id("nav-search-submit-button")).click();

			String ExpectedTitle = "Amazon.ca : LOGITECH H1";
			String actualTitle = searching.provideTitle();
			Assert.assertEquals(actualTitle, ExpectedTitle);
			System.out.print(actualTitle);
			Thread.sleep(5000); 
			screenshots("Search Module5");
		}

		@Test(priority = 6) 
		public void validSearchPRODUCTRELEVANCY() throws InterruptedException {

			action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			searching.Searchbar("wireless earpods");
			driver.findElement(By.id("nav-search-submit-button")).click();

			String ExpectedTitle = "Amazon.ca : wireless earpods";
			String actualTitle = searching.provideTitle();
			Assert.assertEquals(actualTitle, ExpectedTitle);
			System.out.print(actualTitle);
			Thread.sleep(5000);
			screenshots("Search Module6");
		}

		@Test(priority = 7) 
		public void validSearchSORTBY() {

			action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			searching.Searchbar("wireless earpods");
			driver.findElement(By.id("nav-search-submit-button")).click();

			String ExpectedTitle = "Amazon.ca : wireless earpods";
			String actualTitle = searching.provideTitle();
			Assert.assertEquals(actualTitle, ExpectedTitle);
			System.out.print(actualTitle);

			action.moveToElement(driver.findElement(By.id("s-result-sort-select"))).build().perform();
			Select obj = new Select(driver.findElement(By.id("s-result-sort-select")));
			obj.selectByIndex(4);
			screenshots("Search Module7");

		}

		@AfterMethod
		public void Close() {
			driver.close();
		}
		
		
}
