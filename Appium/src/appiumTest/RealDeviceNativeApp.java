package appiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDeviceNativeApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");
		File fs= new File(f,"ApiDemos-debug.apk");
			
		DesiredCapabilities cap = new DesiredCapabilities();
//Same code as of invoking in android emulator.. only change is the device name..
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
				cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
				cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
				
				AndroidDriver <AndroidElement> driver = new AndroidDriver <AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//android.widget.TextView[@index='8']")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
						
				driver.findElement(By.className("android.widget.CheckBox")).click();
				driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
							
				driver.findElement(By.xpath("(//android.widget.EditText)")).sendKeys("test");
				
				driver.findElementByAndroidUIAutomator("text(\"OK\")").click();

	}

}
