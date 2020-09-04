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

public class Swipe extends AppInvoke{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		TouchAction ta = new TouchAction(driver);
		WebElement Views = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		ta.tap(tapOptions().withElement(element(Views))).perform();
		WebElement Date = driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");
		ta.tap(tapOptions().withElement(element(Date))).perform();
		WebElement Inline = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2. Inline']"));
		ta.tap(tapOptions().withElement(element(Inline))).perform();
		WebElement Hour = driver.findElement(By.xpath("//*[@content-desc='6']"));
		ta.tap(tapOptions().withElement(element(Hour))).perform();
		WebElement SourceMinutes = driver.findElement(By.xpath("//*[@content-desc='15']"));
		WebElement DestMinutes = driver.findElement(By.xpath("//*[@content-desc='40']"));
		ta.longPress(longPressOptions().withElement(element(SourceMinutes)).withDuration(ofSeconds(2))).moveTo(element(DestMinutes)).release().perform();	
		

	}

}
