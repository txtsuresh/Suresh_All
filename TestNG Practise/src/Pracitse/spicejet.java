package Pracitse;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class spicejet extends browserInvoke {

	@Parameters ("spiceURL")
	@Test ()
	public void spicejethomepage(String SpicejetURL)
	{


		driver.get(SpicejetURL);
		
		System.out.println("Spicejet home page is displayed");
			
		
		}
		
	
	
	

}

