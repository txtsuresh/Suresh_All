package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLoginpage {

	WebDriver driver;
public FBLoginpage(WebDriver driver) {
	this.driver=driver;
}	
	By Email = By.xpath("//input[@type='email']");
	By Password = By.name("pass");
	By LogIn = By.xpath("//input[@type='submit']");
	By ForgotAccount = By.linkText("Forgot account?");
	

	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement LogIn()
	{
		return driver.findElement(LogIn);
	}
	
	public WebElement ForgotAccount()
	{
		return driver.findElement(ForgotAccount);
	}
	


}
