package StepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.HTTPActions;
import resources.Body;
import resources.Utils;
import groovyjarjarantlr4.v4.codegen.model.Action;

public class stepDefintions extends Utils {
	 RequestSpecification req;
//	 ResponseSpecification response;
	 static Response resp;
	 Body value = new Body();
	 HTTPActions method = new HTTPActions();
	 JsonPath js ;


@Given("User has API Endpoint & keyvalue with {string} {string} {string}")
public void user_has_api_endpoint_keyvalue_with(String name, String address, String language) throws FileNotFoundException {
        	
   		 req= given().spec(GetRequestSpec()).body(value.GetAddress(name, address, language));
   		 System.out.println(value.GetAddress(name, address, language));

   		
	    }

    @When("^User performs Post action$")
    public void user_performs_Post_action() throws Throwable {
     	
     resp = req.when().post(method.GetAdd()).then().spec(GetResponseSpec()).extract().response();

	    }

    @Then("^Response is displayed as 200$")
    public void response_is_displayed_as_200() throws Throwable {
	    	assertEquals(resp.statusCode(),200);   	
	        
	    }

	    @And("{string} is displayed as {string}")
	    public void something_is_displayed_as_something(String actualvalue, String expectedvalue) throws Throwable {
//	    	String data =resp.asString();
//	    	JsonPath js = new JsonPath(data);
	    	assertEquals(GetJsonpath(resp, actualvalue), expectedvalue);
	    }


	    @Given("User has API Endpoint & keyvalue & {string}")
	    public void user_has_api_endpoint_keyvalue(String actualplaceid) throws FileNotFoundException {
//	    	String data =resp.asString();
//	    	JsonPath js = new JsonPath(data);
//	    	String value= js.get("place_id").toString();
	    	String place_id= GetJsonpath(resp, actualplaceid);
	    	req= given().spec(GetRequestSpec()).queryParam("place_id", place_id);
	    }



	    @When("User performs Get action")
	    public void user_performs_get_action() {
	    	 resp = req.when().get(method.GetView()).then().spec(GetResponseSpec()).extract().response();
	    }






}
