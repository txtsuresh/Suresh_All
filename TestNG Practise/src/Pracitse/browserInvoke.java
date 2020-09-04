package Pracitse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class browserInvoke {
	
	static WebDriver driver=null;
	
@BeforeSuite
public void ChromeB()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");
	 driver = new ChromeDriver();
			
	System.out.println("test");
			
}

}
