package appiumTest;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragDrop extends AppInvoke{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		TouchAction ta = new TouchAction(driver);
		WebElement Views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		ta.tap(tapOptions().withElement(element(Views))).perform();
		driver.findElement(By.xpath("//*[@text='Drag and Drop']")).click();
		WebElement Source = driver.findElements(By.className("android.view.View")).get(0);
		WebElement dest = driver.findElements(By.className("android.view.View")).get(1);
		ta.longPress(longPressOptions().withElement(element(Source)).withDuration(ofSeconds(3))).moveTo(element(dest)).release().perform();

	}

}
