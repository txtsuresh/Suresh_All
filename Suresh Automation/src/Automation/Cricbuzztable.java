package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzztable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		int a=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22581/aus-vs-nz-1st-test-new-zealand-tour-of-australia-2019-20");
	WebElement innings1 =driver.findElement(By.xpath("(//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));
	List<WebElement> runs = innings1.findElements(By.xpath("//div[@class='cb-col cb-col-8 text-right text-bold']")); 
	
	for(int i=1;i<runs.size();i++)
	{
		System.out.println(runs.get(i).getText());
		
		String s = runs.get(i).getText();
		int s1=Integer.parseInt(s);
		a = s1 + a;
		
	}
	System.out.println(a);
	
	
	
	}

}
