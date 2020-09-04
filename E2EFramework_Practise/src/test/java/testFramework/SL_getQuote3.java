package testFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Repository.browser_Invoke;
import pageOBFramework.GetQuotepage;
import pageOBFramework.HealthInfoPage;
import pageOBFramework.TellYourselfpage;
import pageOBFramework.coveragePage;

public class SL_getQuote3 extends browser_Invoke{
	
	public static Logger log = LogManager.getLogger(browser_Invoke.class.getName());
	public WebDriver driver;
@BeforeTest
public void browserstart() throws IOException
{
driver = invokebrowser();
	
	driver.get(data.getProperty("URL"));
	log.info("Sunlife URL is launched");

	
}

@Test	
public void getquote3() throws IOException, InterruptedException
{
	
//Page 1
	GetQuotepage GQ= new GetQuotepage(driver);
	GQ.getquote().click();
//Page 2	
	TellYourselfpage TY = new TellYourselfpage(driver);
	Thread.sleep(2000);
	TY.getDOB().sendKeys("12/12/2001");
	log.info("DOB is entered");
	Thread.sleep(2000);
	TY.getSex().click();
	log.info("Male is selected");
	TY.getSmoked().click();
	log.info("Smoke is checked");
	Select province = new Select(TY.getProvince());
	province.selectByValue("5");
	log.info("Province is entered");
	TY.GetQuickQuote().click();
//Page 3		
	coveragePage CP = new coveragePage(driver);
	CP.getCriticalIllness().click();
	CP.getNext().click();
	

	
//Page 4	
	HealthInfoPage HP = new HealthInfoPage(driver);
	HP.getHIV().click();
	HP.getgenetic().click();
	
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement button = HP.getNext();
	 js.executeScript("arguments[0].scrollIntoView();", button);
	
	HP.getNext().click();

	
}
@AfterTest
public void closebrowser()
{
	driver.close();
}	

}
