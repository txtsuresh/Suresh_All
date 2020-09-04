package Pracitse;

import java.io.File;
import java.io.IOException;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class google extends browserInvoke {


	
	@Parameters("URL")
	@Test 
	public void googlehomepage(String GoogleURL) 
	{		
		
		driver.get(GoogleURL);
		System.out.println("Google home page is displayed");
		
	}
	
	@Test
	public void GoogleSearch1()
		{
		driver.get("https://www.google.ca/");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("apple");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
		System.out.println("Google search page is displayed");
		
	}
	
}
