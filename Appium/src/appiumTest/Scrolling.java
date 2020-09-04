package appiumTest;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrolling extends AppInvoke{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		TouchAction ta = new TouchAction(driver);
		WebElement Views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		ta.tap(tapOptions().withElement(element(Views))).perform();
		
		WebElement WebView = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
		ta.tap(tapOptions().withElement(element(WebView))).perform();
		

	}

}
