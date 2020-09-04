package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		
		while(! driver.findElement(By.className("ui-datepicker-month")).getText().contains("October"))
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
	
		driver.findElement(By.xpath("//td/a[contains(text(),'31')]")).click();
		
		
	}

}
