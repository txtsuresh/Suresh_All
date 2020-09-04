package pageOBFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TellYourselfpage {
	
	public WebDriver driver;
	
	By DOB= By.xpath("//input[@id='72025a91']");
	
	By Sex =By.xpath("//label[@class='rb_standard_new rb_standard radioLabel RadioButtonHelperText1 RadioButtonHelperTextMale']");
	By Smoked = By.xpath("//label[@for='97b0b4d3Yes']");
	By Province = By.cssSelector(".provinceflag");
	By GetQuickQuote = By.xpath("//button[text()='Get a quick quote']");
	
	public TellYourselfpage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getDOB()
	{
		return driver.findElement(DOB);
	}
	public WebElement getSex()
	{
		return driver.findElement(Sex);
	}
	public WebElement getSmoked()
	{
		return driver.findElement(Smoked);
	}
	public WebElement getProvince()
	{
		return driver.findElement(Province);
	}
	public WebElement GetQuickQuote()
	{
		return driver.findElement(GetQuickQuote);
	}
}
