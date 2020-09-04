package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	       WebElement Element = driver.findElement(By.cssSelector(".travel-icon.group-traveller"));
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        driver.findElement(By.cssSelector(".travel-icon.group-traveller")).click();
	//	driver.findElement(By.cssSelector(".travel-icon.group-traveller")).sendKeys(Keys.CONTROL, Keys.ENTER);
		driver.manage().deleteAllCookies();
		//driver.close();
		driver.quit();

	}

}
