package AppiumFW;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HybridChromepage {
	public AndroidDriver driver;
	
	public HybridChromepage(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By search = By.name("q");
	


	public WebElement getsearch()
	{
		return driver.findElement(search);
	}

}
