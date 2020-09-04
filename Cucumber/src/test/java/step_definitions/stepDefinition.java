package step_definitions;

import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	

@Given("User is on google home page")
public void user_is_on_google_home_page() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Given-Homepage");
}


@When("User performs a google {string} & {string} search")
public void user_performs_a_google_search(String arg1, String arg2) {
	System.out.println(arg1+arg2);
    
}
@Then("Search page is displayed")
public void search_page_is_displayed() {
	 System.out.println("Then-Searchpage");
   
}
@Then("Search results for {string} are displayed")
public void search_results_for_are_displayed(String arg3) {
	 System.out.println(arg3);
}
}
