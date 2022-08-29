package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(linkText = "Register")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[text()='Login']") // added in step6
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@name='search']") // searchbox element
	WebElement txtSearchbox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") // search button
	WebElement btnSearch;
	

	// Action Methods
	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
	
	public void enterProductName(String pName)
	{
		txtSearchbox.sendKeys(pName);
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	
	
	
}
