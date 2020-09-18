package resources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import StepDefinations.stepDefintions;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {
	public static RequestSpecification request;
	
	public RequestSpecification GetRequestSpec() throws FileNotFoundException
	{
		if (request== null)
		{
			PrintStream log = new PrintStream(new FileOutputStream("log.txt"));
    	
    	request =new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
    		.addFilter(RequestLoggingFilter.logRequestTo(log))
    		.addFilter(ResponseLoggingFilter.logResponseTo(log))
		   .addQueryParam("key", "qaclick123").addHeader("Content-Type", "application/json").build();
    	
    	return request;
			
		}
		return request;
	}

	
	public ResponseSpecification GetResponseSpec()
	{
		ResponseSpecification response = new ResponseSpecBuilder().expectStatusCode(200).build();
		return response;
	}
	
	public String GetJsonpath(Response resp, String actualvalue)
	{

		String data =resp.asString();
    	JsonPath js = new JsonPath(data);
   	   return js.get(actualvalue).toString();
   	
   	
	}
}
