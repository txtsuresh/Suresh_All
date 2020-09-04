package appiumTest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TapLongPress extends AppInvoke{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>  driver = Capabilities();
		//driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		TouchAction ta = new TouchAction(driver); 
		WebElement views = driver.findElementByAndroidUIAutomator("text(\"Views\")"); 
		 ta.tap(tapOptions().withElement(element(views))).perform();
		 WebElement Expandable = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		 ta.tap(tapOptions().withElement(element(Expandable))).perform();
		 WebElement custom = driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']"));
		 ta.tap(tapOptions().withElement(element(custom))).perform();
		 WebElement peoplename = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		 
		 ta.longPress(longPressOptions().withElement(element(peoplename)).withDuration(ofSeconds(3))).release().perform();
				
		
		

	}

}

