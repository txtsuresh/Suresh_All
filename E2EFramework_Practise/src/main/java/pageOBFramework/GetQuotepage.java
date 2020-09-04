package pageOBFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetQuotepage {
	public WebDriver driver;
	
	
	By GetQuote = By.xpath("//div[@class='left-item text-section hide-in-editorial']/p/a");
	
public GetQuotepage(WebDriver driver) {
		this.driver=driver;
	}

public WebElement getquote()
{
	
	return driver.findElement(GetQuote);
}



}
