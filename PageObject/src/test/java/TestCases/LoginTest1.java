package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.FBForgotAccount;
import ObjectRepository.FBLoginpage;

public class LoginTest1 {


@Test
public void login()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	FBLoginpage login = new FBLoginpage(driver);
	login.Email().sendKeys("Username");
	login.Password().sendKeys("password");
//	login.LogIn().click();
	login.ForgotAccount().click();
	
	FBForgotAccount account = new FBForgotAccount(driver);
	account.MobilNumber().sendKeys("123456");
	account.Search().click();
	account.Cancel().click();
	
}
		
	

}
