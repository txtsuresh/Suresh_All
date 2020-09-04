package Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiplewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
				
		driver.get("https://accounts.google.com/");
		System.out.println(driver.getTitle());
	 
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		
	Set<String> id = driver.getWindowHandles();
	
		Iterator<String> a = id.iterator();
				String parent = a.next();
				String child1 =a.next();
				String child2 =a.next();
				driver.switchTo().window(child1);
				System.out.println(driver.getTitle());
				driver.switchTo().window(child2);
				System.out.println(driver.getTitle());
				driver.switchTo().window(parent);
				System.out.println(driver.getTitle());
		
	}

}
