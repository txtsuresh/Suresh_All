package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Autosugestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
				
		ChromeOptions c =new ChromeOptions();
		c.merge(ch);
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='page-section sticky-scroll topSection appendBottom40']")).click();
		driver.findElement(By.id("fromCity")).click();
		//driver.findElement(By.id("fromCity")).click();
	//	driver.findElement(By.cssSelector("#fromCity")).click();
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("cjb");
	  Thread.sleep(5000); 
	driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys(Keys.DOWN,Keys.ENTER);
	//driver.findElement(By.id("toCity")).click();
	driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("MAA");
	  Thread.sleep(5000); 
	driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys(Keys.DOWN,Keys.ENTER);
	
	 
//		System.out.println("================now executing java script=======================");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement ws = 		driver.findElement(By.id("fromCity"));
//		js.executeScript("arguments[0].click();", ws);
	}

}
