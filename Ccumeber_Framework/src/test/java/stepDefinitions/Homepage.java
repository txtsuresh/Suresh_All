package stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Cucumber.GetQuotepage;

import Cucumber.TellYourselfPAge;
import Repository.browser_Invoke;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage extends browser_Invoke{
	public static WebDriver driver;
	public static Logger log = LogManager.getLogger(Homepage.class.getName());
	
	@Given("User launch sunlife URl {string}")
	public void user_launch_sunlife_u_rl(String arg1) throws IOException {
		driver=getbrowser();
		driver.get(arg1);
	   
	}



	@When("User selects Get a Quote button")
	public void select_get_a_quote_button() {
		GetQuotepage GQ=new GetQuotepage(driver);
		GQ.getGetquote().click();
		log.info("Get Quote button clicked");
	    
	}
	@Then("Tell us about yourself page is displayed")
	public void tell_us_about_yourself_page_is_displayed() throws InterruptedException {
		TellYourselfPAge TY=new TellYourselfPAge(driver);
		//TY.getDOB().sendKeys("11/01/1989");
		Thread.sleep(3000);
		Assert.assertTrue(TY.getDOB().isDisplayed());
	
	}
	@And("User enter values on Get a Quote page")
	public void User_enter_values_on_Get_a_Quote_page() throws InterruptedException {
		TellYourselfPAge TY=new TellYourselfPAge(driver);
		Thread.sleep(2000);
		TY.getDOB().sendKeys("12/12/2001");
		log.info("DOB is entered");
		Thread.sleep(3000);
		TY.getSex().click();
		log.info("Sex is selected");
		TY.getSmoked().click();
		log.info("Smoke option is selected");
		Select province = new Select(TY.getProvince());
		province.selectByValue("5");
		log.info("Province is selected");
		TY.getGetQuickQuote().click();
		
		
	}
	

    @And("^User enter (.+) values on Get a Quote page$")
    public void user_enter_values_on_get_a_quote_page(String dob) throws Throwable {
		TellYourselfPAge TY=new TellYourselfPAge(driver);
		Thread.sleep(2000);
		TY.getDOB().sendKeys(dob);
		log.info("DOB is entered");
		Thread.sleep(3000);
		TY.getSex().click();
		log.info("Sex is selected");
		TY.getSmoked().click();
		log.info("Smoke option is selected");
		Select province = new Select(TY.getProvince());
		province.selectByValue("5");
		log.info("Province is selected");
		TY.getGetQuickQuote().click();
		
		
	}
}
