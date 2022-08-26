package testCasesPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectsPractice.AccountRegistrationPagePractice;
import PageObjectsPractice.HomePagePractice;
import testbasePractice.BaseClassPractice;

public class TC_001_AccountRegistrationTestPractice  extends BaseClassPractice{
	
	
	     

	      @Test
	      
	     public void test_account_registrationpractice()
	      {
	    try
	     {
	    		  
	    	  HomePagePractice hp=new HomePagePractice(driver);
	    	  hp.clickMyAccount();
	    	  hp.clickRegister();
	    	  
	    	  AccountRegistrationPagePractice regpage=new AccountRegistrationPagePractice(driver);
	      
	      regpage.setFirstName(randomeString().toUpperCase());
			
			regpage.setLastName(randomeString().toUpperCase());
			
			regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the email
			
			regpage.setTelephone(randomeNumber());
			
			regpage.setPassword("test@123");
			
			regpage.setConfirmPassword("test@123");
			
			regpage.setPrivacyPolicy();
			
			regpage.clickContinue();
			
			String confmsg = regpage.getConfirmationMsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
}
}
