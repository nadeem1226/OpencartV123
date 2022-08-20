package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	//elements
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")// my account page heading part text 
	
		WebElement msgHeading;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']") //{7.3}
	
	   WebElement lnklogout;
	
	
	public boolean isMyAccountPageExits()
	{
		try
		{
			return (msgHeading.isDisplayed());// returns the boolean
		}
		catch(Exception e )
		{
			return (false);
		}
	}
	
	// to click logout{7.3}
	
	public void clicklogout()
	{
		lnklogout.click();
	}

}
