package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Automation_spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
//Xpath

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
//Regular Expression'
//AssertFalse
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());

		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		Thread.sleep(2000);
//AssertTrue
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
// Is Selected - True por False print in console		
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
//Parent to child Index
		driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[12]/div[3]")).click();
		Thread.sleep(2000);

//CSS
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("[text='Chennai (MAA)']")).click();
		Thread.sleep(2000);
//Parent-Child Relationship Locator
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Coimbatore (CJB)']")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		System.out.println(driver.findElement(By.cssSelector("#Div1")).isEnabled());

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Field is enabled");
		} else {
			System.out.println("Field is disabled");
		}

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		Select a = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		a.selectByValue("5");
		Thread.sleep(2000);
		Select b = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Child")));
		b.selectByIndex(3);

//Get Text from application
		System.out.println(driver.findElement(By.cssSelector("[id='divpaxinfo']")).getText());
//AssertEquals
		Assert.assertEquals(driver.findElement(By.cssSelector("[id='divpaxinfo']")).getText(), "5 Adult, 3 Child");
		Select c = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		c.selectByVisibleText("USD");

		driver.findElement(By.linkText("Special Assistance")).click();
		driver.findElement(By.id("SpecialAssistanceWindow")).click();

		driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.close();
		// driver.quit();
	}

}
