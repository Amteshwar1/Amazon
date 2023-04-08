package pompackage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseAmazonClass;

public class Pomsecurity extends BaseAmazonClass{

	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")WebElement loginsecurity;
	@FindBy(css="#auth-cnep-edit-name-button")WebElement nameedit;
	@FindBy(css="#ap_customer_name")WebElement newname;
	@FindBy(css="#cnep_1C_submit_button")WebElement savechanges;
	@FindBy(css="#auth-cnep-edit-email-button")WebElement emailedit;
	@FindBy(css="#cvf-page-content > div > div > div > form > div:nth-child(4) > div > div.a-row.a-grid-vertical-align.a-grid-center > div > input")WebElement newemail;
	@FindBy(css="#a-autoid-0 > span > input") WebElement emailcontinue;
	
	
	public Pomsecurity() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void typenewname (String name) {
		newname.sendKeys(name);
	}
	public void typenewemail(String email) {
		newemail.sendKeys(email);
	}
	
	public void clickbtn() {
		emailcontinue.click();
	}
	public void securitytab() {
		loginsecurity.click();
	}
	public void editname() {
		nameedit.click();
	}
	public void savechange() {
		savechanges.click();
	}
	public void editemail() {
		emailedit.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
	
}

