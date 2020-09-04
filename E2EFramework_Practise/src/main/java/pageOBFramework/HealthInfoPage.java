package pageOBFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HealthInfoPage {
	
	public WebDriver driver;
	
	By HIV = By.xpath("//label[@for='23983385Yes']");
	By genetic = By.xpath("//label[@for='f70de960No']");
	By Next =By.xpath("//button[@name='DTCGOActionButtons_pyWorkPage_34']");
	
	public HealthInfoPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}
	public WebElement getHIV()
	{
		
		return driver.findElement(HIV);
	}
	public WebElement getgenetic()
	{
		
		return driver.findElement(genetic);
	}

	public WebElement getNext()
	{
		
		return driver.findElement(Next);
	}
}
