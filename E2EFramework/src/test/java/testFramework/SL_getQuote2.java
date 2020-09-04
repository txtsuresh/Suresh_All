package testFramework;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Repository.browser_Invoke;
import pageOBFramework.GetQuotepage;
import pageOBFramework.HealthInfoPage;
import pageOBFramework.TellYourselfpage;
import pageOBFramework.coveragePage;

public class SL_getQuote2 extends browser_Invoke{

	public WebDriver driver;

@Test	
public void getquote2() throws IOException, InterruptedException
{
	driver = invokebrowser();
	
	driver.get(data.getProperty("URL"));
//Page 1
	GetQuotepage GQ= new GetQuotepage(driver);
	Assert.assertTrue(GQ.getquote().isEnabled());
	GQ.getquote().click();
//Page 2	
	TellYourselfpage TY = new TellYourselfpage(driver);
	Thread.sleep(2000);
	TY.getDOB().sendKeys("10/10/1990");
	Thread.sleep(2000);
	TY.getSex().click();
	TY.getSmoked().click();
	Select province = new Select(TY.getProvince());
	province.selectByValue("7");
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
