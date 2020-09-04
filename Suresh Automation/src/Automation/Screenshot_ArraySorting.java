package Automation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Screenshot_ArraySorting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
	File Scrshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Scrshot, new File ("C:\\Users\\Suresh Kumar\\Desktop\\Automation\\abc.png"));
		
	List<WebElement> list= driver.findElements(By.xpath("//tbody/tr/td[2]"));
	
	ArrayList<String> arrayitems = new ArrayList<String>();
		
	for (int i=0;i<list.size();i++)
	{
		String actuallist = driver.findElements(By.xpath("//tbody/tr/td[2]")).get(i).getText();
		arrayitems.add(actuallist);		
	}
	System.out.println(arrayitems);
	
	ArrayList copyitems = new ArrayList(arrayitems);
	 
	System.out.println(copyitems);
	Collections.sort(copyitems);
	System.out.println(copyitems);
	driver.findElement(By.xpath("//tr/th[2]")).click();
	driver.findElement(By.xpath("//tr/th[2]")).click();
	
	ArrayList<String> Sorteditems = new ArrayList<String>();
	
	for (int i=0;i<list.size();i++)
	{
		String actuallist = driver.findElements(By.xpath("//tbody/tr/td[2]")).get(i).getText();
		Sorteditems.add(actuallist);		
	}
	System.out.println(Sorteditems);
	
	//Assert.assertFalse(copyitems.equals(Sorteditems));
	
  Assert.assertEquals(copyitems, Sorteditems);
		
	}

}
