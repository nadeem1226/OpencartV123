package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass {
	
	@Test(dataProvider="LoginData" , dataProviderClass=DataProviders.class) 	// takes 2 parametrs 
	public void test_Loginddt(String email, String pwd,  String exp)
		
	{
		logger.info("********* Started TC_003_LoginDataDrivenTest*************");
		try
		{
		HomePage hp=new HomePage(driver);//wenever v r creating object of pageobjct class add driver instance
		 hp.clickMyAccount();
		 
		 hp.clickLogin();
		 
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(email);
		 lp.setPassword(pwd);                             // if data is  valid-> my acct pge=true--> test passes
		 lp.clickLogin();                                 // if data is  valid-> my acct pge=false--> test fails
		                                                 // if data is  invalid-> my acct pge=true--> test fail
		                                                 // if data is  invalid-> my acct pge=false--> test passes
		 MyAccountPage macc=new MyAccountPage(driver);
		 boolean targetpage=macc.isMyAccountPageExits();// true or false
		 
	// positive scenarios	 
		 if(exp.equals("Valid"))
		 {
			 if(targetpage==true)
			 {
				 MyAccountPage myaccpage=new MyAccountPage(driver);
				 myaccpage.clicklogout();
				 
				 Assert.assertTrue(true); // test passes
			 }
			  
			 else 
			 {
				 Assert.assertTrue(false);  // test fail
			 }
		 }
		 
	// negative scenarios	 
		 
		if(exp.equals("Invalid"))
		{
			if (targetpage==true)
			{
				 MyAccountPage myaccpage=new MyAccountPage(driver);
				 myaccpage.clicklogout();
				 
				 Assert.assertTrue(false);  // test fail
				
			}
			else
			{
				Assert.assertTrue(false);    // test passes
			}
			
		}
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("********* Finished TC_003_LoginDataDrivenTest*************");
		
	}

}
