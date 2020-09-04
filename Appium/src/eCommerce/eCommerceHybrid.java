package eCommerce;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class eCommerceHybrid extends InvokeApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = ecommerceApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Female\")").click();
					
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
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
		
		TouchAction ta = new TouchAction(driver);
		WebElement checkbox = driver.findElement(By.xpath("//android.widget.CheckBox"));
		ta.tap(tapOptions().withElement(element(checkbox))).perform();
			
			driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(8000);
		driver.getContextHandles();
		System.out.println(driver.getContextHandles());
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("hello");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		driver.context("NATIVE_APP");
		
		
		
		

	}

}
