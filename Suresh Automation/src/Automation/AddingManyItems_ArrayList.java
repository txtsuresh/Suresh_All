package Automation;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingManyItems_ArrayList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
			
		String [] purchase = {"Brocolli ", "Beetroot ", "Beans "};
		
		List<WebElement> productList = driver.findElements(By.cssSelector("[class='product']"));
			
		
		for(int i=0;i<productList.size();i++)
		{
			String list = productList.get(i).getText().split("-")[0];
			System.out.println(list);
	//		list = list.replace("\n", "").split(" ")[0];
			
			List al = Arrays.asList(purchase); 
			if(al.contains(list))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
			}
		}
		

	}

}
