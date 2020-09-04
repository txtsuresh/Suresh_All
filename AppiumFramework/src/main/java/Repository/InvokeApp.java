package Repository;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class InvokeApp {
	public static AppiumDriverLocalService service;
	public static  AndroidDriver <AndroidElement> driver;
	
	public static void startemulator() throws IOException, InterruptedException {
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src/main/java\\Repository\\appium.bat");
		Thread.sleep(8000);
	}
	
	public AppiumDriverLocalService startappium() {
		 service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		return service;
		
	}
	public static AndroidDriver<AndroidElement> ecommerceApp() throws IOException, InterruptedException
	{
		File f = new File ("src/main/java");
		File fs = new File (f,"General-Store.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities ();
		startemulator();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6P");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		
		 driver = new AndroidDriver <AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
return driver;

	}
public static void getScreenshot(String n) throws IOException, InterruptedException
	
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\src/main/java\\Repository\\"+n+".png"));

		
	}
	
	

}
