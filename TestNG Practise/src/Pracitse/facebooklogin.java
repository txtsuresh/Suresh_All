package Pracitse;

import java.io.File;
import java.io.IOException;
import java.sql.Array;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebooklogin extends browserInvoke  {
	
	@Test(dataProvider="signdata")
	public void facebooksignon(String username, String password) throws InterruptedException
	{
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe"); 
//		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.cssSelector("#pass")).sendKeys(password);
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	
	@DataProvider
	public Object[][] signdata()
	
	
	{
		Object [] [] value = new Object [3] [2];
		
		value[0][0]= "test1";
		value[0][1]= "pass1";
		
		value[1][0]= "test2";
		value[1][1]= "pass2";
		
		value[2][0]= "test3";
		value[2][1]= "pass3";
		
		return value;
		
				
		
		
		
	}

}
