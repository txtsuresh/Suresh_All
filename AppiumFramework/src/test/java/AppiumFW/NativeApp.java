package AppiumFW;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Repository.InvokeApp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class NativeApp extends InvokeApp{
	@BeforeTest
	public void killallnodes() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
	}
	
	
	@Test(dataProvider="getName")
		public void nativeapptesting(String name) throws InterruptedException, IOException
	{
		service=startappium();
		AndroidDriver<AndroidElement> driver = ecommerceApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage HP = new HomePage(driver);
		HP.Gender.click();
		HP.countryDD.click();
		HP.countryDDScroll.isDisplayed();
		HP.countryselec.click();
		
		HP.Name.sendKeys(name);
		driver.hideKeyboard();
		HP.Shop.click();
		
		ProductsPage PP = new ProductsPage(driver);
				
		int elements = PP.productsname.size();
		for(int i=0;i<elements;i++)
		{
			String value = PP.productsname.get(i).getText();
				//	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(value);
			if (value.equalsIgnoreCase("Air Jordan 1 Mid SE"))
			{
				PP.ADDCart.get(i).click();
				break;
			}
		}
		PP.productNike.isDisplayed();
		for(int i=0;i<elements;i++)
		{
			String value = PP.productsname.get(i).getText();
			//String value = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(value);
			if (value.equalsIgnoreCase("Nike SFB Jungle"))
			{
				PP.ADDCart.get(i).click();
				break;
			}
		}
		PP.Cartbutton.click();
		
		CartPage CP = new CartPage(driver);
				
		TouchAction ta = new TouchAction(driver);
		ta.tap(tapOptions().withElement(element(CP.checkbox))).perform();
		CP.completepurchase.click();
					
		Thread.sleep(8000);
		driver.getContextHandles();
		System.out.println(driver.getContextHandles());
	driver.context("WEBVIEW_com.androidsample.generalstore");
		
		HybridChromepage HC = new HybridChromepage(driver);
		
		HC.getsearch().sendKeys("hello");
		HC.getsearch().sendKeys(Keys.ENTER);
	
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		service.stop();
		
	}

	@DataProvider
	public Object[][] getName()
	{
		Object[][] data = new Object [][]
		{
			{"hello"}, {"test"}
		};
		return data;
		
	}
}
