package AppiumFW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	public AndroidDriver <AndroidElement> driver;
	public HomePage(AndroidDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	
	@AndroidFindBy(uiAutomator="text(\"Female\")")
	public WebElement Gender;
	
	@AndroidFindBy(uiAutomator="text(\"Enter name here\")")
	public WebElement Name;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement Shop;
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement countryDD;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"Canada\"))")
	public WebElement countryDDScroll;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Canada']")
	public WebElement countryselec;

	
	

	}
	
	

