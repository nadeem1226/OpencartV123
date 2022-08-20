package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	@Test(groups= {"Regression","Master"})
	public void test_account_Registration() throws InterruptedException
	{	
		logger.info(" ***********Started TC_001_AccountRegistrationTest***********");
		
		
		
		try
		{
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
						
			hp.clickRegister();
			
			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			
			regpage.setFirstName(randomeString().toUpperCase());
			logger.info("provided first name");
			logger.info("provided  name");
		
			regpage.setLastName(randomeString().toUpperCase());
			logger.info("provided last name");
			
			regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the email
			logger.info("provided email");
			
			regpage.setTelephone(randomeNumber());
			logger.info("provided telephone number");
			
			regpage.setPassword("test@123");
			logger.info("provided password");
			
			regpage.setConfirmPassword("test@123");
			logger.info("confirmed password");
			
			regpage.setPrivacyPolicy();
			logger.info("clicked policy");
			
			regpage.clickContinue();
			logger.info("clicked continue");
			
			Thread.sleep(2000);
			
			String confmsg = regpage.getConfirmationMsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{    
			logger.error("Registration test  failed");// executes if test fails
			Assert.fail();
		}
		
		logger.info(" ***********Finished TC_001_AccountRegistrationTest***********");
	}
					
	}


