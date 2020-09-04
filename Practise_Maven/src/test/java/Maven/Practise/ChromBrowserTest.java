package Maven.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class ChromBrowserTest {
	
	static WebDriver driver = null;
	
	@BeforeSuite
	public void chrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		 driver = new ChromeDriver();
			
	}

}
