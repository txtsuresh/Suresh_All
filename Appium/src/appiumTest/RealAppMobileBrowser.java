package appiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealAppMobileBrowser {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
	
						cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6P");
						cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
						cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
				
						
						AndroidDriver <AndroidElement> driver = new AndroidDriver <AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
						System.out.println("hello3");
						driver.get("https://facebook.com");
						driver.quit();
						
					
	}

}
