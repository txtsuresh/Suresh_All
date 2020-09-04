package Pracitse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class youtube {
	
	
	@Test ()
	public void youtubepage()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		System.out.println("youtube displayed");
	}


}
