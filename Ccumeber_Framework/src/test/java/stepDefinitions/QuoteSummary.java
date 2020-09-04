package stepDefinitions;

import org.junit.Assert;
import Cucumber.HealthInfoPage;
import Cucumber.coveragePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class QuoteSummary {
	
	@Then("Coverage page is displayed")
	public void Coverage_page_is_displayed() throws InterruptedException {
		coveragePage cov = new coveragePage(Homepage.driver);
	Assert.assertTrue(cov.getCriticalIllness().isDisplayed());	
	}	
		
	@And("User enter values on Coverage page")
	public void User_enter_values_on_Coverage_page() throws InterruptedException {
		coveragePage CP = new coveragePage(Homepage.driver);
		CP.getCriticalIllness().click();
		CP.getNext().click();
		
	
	}
	@Then("Health Info page is displayed")
	public void HealthInfo_page_is_displayed() throws InterruptedException {
		HealthInfoPage HI = new HealthInfoPage(Homepage.driver);
		Assert.assertTrue(HI.getHIV().isDisplayed());
	
	}

}
