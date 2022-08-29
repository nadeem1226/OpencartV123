package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{    
	 @Test(groups={"Sanity","Master"})
	 public void test_login()
	 {
		 try
		 {
		 logger.info("************* starting TC_002_LoginTest***********");
		 HomePage hp=new HomePage(driver);//wenever v r creating object of pageobjct class add driver instance
		 hp.clickMyAccount();
		 
		 hp.clickLogin();
		 
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("email"));
		 lp.setPassword(rb.getString("password"));
		 lp.clickLogin();
		 
		 MyAccountPage macc=new MyAccountPage(driver);
		 boolean targetpage=macc.isMyAccountPageExists();
		 
		 Assert.assertEquals(targetpage, true);
		 }
		 catch(Exception e)
		 {
			 Assert.fail();
		 }
		 logger.info("**************finished TC_002_LoginTest************");
		 
	 }

}
