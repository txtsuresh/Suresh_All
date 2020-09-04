package Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser_Invoke {
	
	public WebDriver driver;
	public Properties datas;
	
	public WebDriver getbrowser() throws IOException
	{
		 datas = new Properties();
		// FileInputStream fs = new FileInputStream("C:\\Users\\Suresh Kumar\\eclipse-workspace\\Ccumeber_Framework\\src\\main\\java\\Repository\\datas.properties");
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src/main/java\\Repository\\datas.properties");
		datas.load(fs);
		
		String browserdata = datas.getProperty("browser");
		if (browserdata.equals("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src/main/java\\Repository\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else if(browserdata.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src/main/java\\Repository\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		return driver;
	}
	
	
	

}
