package Automation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//Implicit Wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String [] purchaselist= {"Cauliflower ", "Cucumber ","Mushroom "};
		
	List<WebElement> storelist =	driver.findElements(By.xpath("//div[@class='product']"));
	
	
	for(int i=0;i<storelist.size();i++)
	{
		String list= storelist.get(i).getText().split("-")[0];
		List purhcaselistarray = Arrays.asList(purchaselist); 
		if(purhcaselistarray.contains(list))
		{
			driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
		}
	}
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

	driver.findElement(By.className("promoCode")).sendKeys("test");

	driver.findElement(By.cssSelector("button.promoBtn")).click();
//Explicit Wait
	WebDriverWait explicit = new WebDriverWait(driver, 5);
	explicit.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
	

	System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	driver.findElement(By.cssSelector(".promoCode")).clear();
	
	driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
//Thread.sleep
	Thread.sleep(5000);	
	System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}

}
