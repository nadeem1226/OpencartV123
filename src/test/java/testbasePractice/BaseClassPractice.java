  package testbasePractice;   // reusable methods are created in base class

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPractice {
	
	 public WebDriver driver;
     
     @BeforeClass
    public void setup()
     {
    	 WebDriverManager.chromedriver().setup();
   	  driver=new ChromeDriver();
   	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	  
   	  driver.get("http://localhost/opencart/upload/");
   	  driver.manage().window().maximize();
     }
     
     @AfterClass
     public void tearDown()
     {
    	 driver.quit();
     }
     
     public String randomeString()  // reusable method to generate random data
     {
    	 String generatedString=RandomStringUtils.randomAlphabetic(5);
    	 return generatedString;
     }
     
     public String randomeNumber()
     {
    	 String generatedString=RandomStringUtils.randomNumeric(10);
    	 return generatedString;
     }
     

}
