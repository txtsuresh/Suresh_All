package Maven.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class googleTest extends ChromBrowserTest {
	

	@Test
	public void google()
	{
		driver.get("https://www.google.ca/");
		System.out.println("Google displayed");
	}
	
	
	

}
