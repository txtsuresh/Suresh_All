package eCommerce;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class eCommerceNative extends InvokeApp{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub'
		
		AndroidDriver<AndroidElement> driver = ecommerceApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Female\")").click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Canada\"))");
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + Canada + "\").instance(0))"));  
		driver.findElement(By.xpath("//android.widget.TextView[@text='Canada']")).click();
			Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		System.out.println(driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name"));
		driver.findElementByAndroidUIAutomator("text(\"Enter name here\")").sendKeys("test");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		int elements = driver.findElements(By.className("android.widget.TextView")).size();
		for(int i=0;i<elements;i++)
		{
			String value = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(value);
			if (value.equalsIgnoreCase("Air Jordan 1 Mid SE"))
			{
				driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(i).click();
				break;
			}
		}
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"))");
		for(int i=0;i<elements;i++)
		{
			String value = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(value);
			if (value.equalsIgnoreCase("Nike SFB Jungle"))
			{
				driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(i).click();
				break;
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
		
		TouchAction ta = new TouchAction(driver);
		WebElement checkbox = driver.findElement(By.xpath("//android.widget.CheckBox"));
		ta.tap(tapOptions().withElement(element(checkbox))).perform();
		Thread.sleep(3000);
		WebElement Terms = driver.findElement(By.xpath("//android.widget.TextView[@text='Please read our terms of conditions']"));
		//WebElement Terms = driver.findElementByAndroidUIAutomator("text(\"Please read our terms of conditions\")");
		 
		ta.longPress(longPressOptions().withElement(element(Terms)).withDuration(ofSeconds(3))).release().perform();
			
		WebElement close = driver.findElementByAndroidUIAutomator("text(\"CLOSE\")");
		ta.tap(tapOptions().withElement(element(close))).perform();
		

	}

}
