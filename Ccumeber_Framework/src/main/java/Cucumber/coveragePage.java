package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class coveragePage {
	public WebDriver driver;
	
		By Critical = By.xpath("//label[@for='b308d431CI']");
	 By Next = By.xpath("//button[@name='DTCGOActionButtons_pyWorkPage_34']");
		
		public coveragePage(WebDriver driver) {
			this.driver=driver;
		// TODO Auto-generated constructor stub
	}
		public WebElement getCriticalIllness()
		{
			return driver.findElement(Critical);
		}
		public WebElement getNext()
		{
			return driver.findElement(Next);
		}

}
