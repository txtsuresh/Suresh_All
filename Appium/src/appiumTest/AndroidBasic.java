package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidBasic extends AppInvoke{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
				
		AndroidDriver <AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@index='8']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().enabled(true)").size());	
		
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
					
		driver.findElement(By.xpath("(//android.widget.EditText)")).sendKeys("test");
		
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		
	//	driver.findElement(By.id("android:id/button1")).click();
		

		
		

	}


}
