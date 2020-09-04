package appiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserInvoke {
	
	public static AndroidDriver<AndroidElement> ChromeCapabilities() throws MalformedURLException {
	
			
		DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
				cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
				cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

				AndroidDriver <AndroidElement> driver = new AndroidDriver <AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		return driver;

}
}
