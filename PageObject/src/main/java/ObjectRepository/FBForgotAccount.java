package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBForgotAccount {
	WebDriver driver;
	
	public FBForgotAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy (id = "identify_email")
			WebElement MobileNumber;
	
	@FindBy(name="did_submit")
	WebElement Search;
	
	@FindBy(className="uiButtonText")
	WebElement Cancel;
	
	public WebElement MobilNumber()
	{
		return MobileNumber;
	}
	public WebElement Search()
	{
		return Search;
	}
	public WebElement Cancel()
	{
		return Cancel;
	}
	
}

