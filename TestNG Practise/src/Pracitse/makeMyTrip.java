package Pracitse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class makeMyTrip extends browserInvoke {
	
	@Test (timeOut=5000)
	public void makemytriphomepage()
	{
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe"); 
//		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		System.out.println("makemytrip home page displayed");
	}

}
