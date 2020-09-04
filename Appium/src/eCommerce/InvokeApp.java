package eCommerce;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class InvokeApp {
	
	public static AndroidDriver<AndroidElement> ecommerceApp() throws MalformedURLException
	{
		File f = new File ("src");
		File fs = new File (f,"General-Store.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities ();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6P");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		
		AndroidDriver <AndroidElement> driver = new AndroidDriver <AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
return driver;

	}

}
