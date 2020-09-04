package Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links_exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//tagname "a" used to find all links in the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
//find#links in footer column 1		
		WebElement footercolumn = driver.findElement(By.xpath("(//div/table/tbody/tr/td/ul)[1]"));
			
		System.out.println(footercolumn.findElements(By.tagName("a")).size()); 
//Opening the links in new window		
		for(int i=1;i<footercolumn.findElements(By.tagName("a")).size();i++)
		{		
			footercolumn.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);	
		}
//Navigating to new window & get page titles		
		Set<String> s=	driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		while (it.hasNext())
		{
			String a= it.next();
			System.out.println(driver.switchTo().window(a).getTitle()); 
			
		}
				

	}

}
