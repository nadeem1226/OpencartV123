package PageObjectsPractice;    // secound page object class contains only page elements and corresponding action methods only

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPagePractice extends BasePagePractice {
	

	
	public AccountRegistrationPagePractice(WebDriver driver)
	{
		super(driver);
	}
   
	
    // elements 
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(name="telephone")
	WebElement txtTelephone;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="confirm")
	WebElement txtConfirmPassword;
	
	@FindBy(name="agree")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);

	}

	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}

	public void setPrivacyPolicy() {
		chkdPolicy.click();

	}

	public void clickContinue() {
		btnContinue.click();

	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
}