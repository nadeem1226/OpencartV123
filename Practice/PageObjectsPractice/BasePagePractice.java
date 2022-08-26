package PageObjectsPractice; // if we create any new page object classes that should be extnded by base page only

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePagePractice {
	
	WebDriver driver;
	public BasePagePractice(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
