package RestAPI;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SpecBuilder_GoogleAPI {

	public static void main(String[] args) {

	RequestSpecification request= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
			.addQueryParam("key", "qaclick123")
			.addHeader("Content-Type", "application/json").build();
	
	ResponseSpecification res=new ResponseSpecBuilder().expectStatusCode(200).build();

	//Post method
	//	RestAssured.baseURI="https://rahulshettyacademy.com";
	

		String response=given().log().all().spec(request)
			.body(RequestBody.Getaddress())
			.when().post("maps/api/place/add/json")
			.then().log().all().assertThat().spec(res).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();


		
//Get method
		
		JsonPath js = new JsonPath(response);
		String placeid=js.get("place_id");
		
		given().log().all().spec(request).queryParam("place_id", placeid)
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().spec(res);
		
//Put method
		given().log().all().spec(request).body("{\r\n" + 
				"\"place_id\":\""+ placeid +"\",\r\n" + 
				"\"address\":\"70 Summer walk, USA\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"")
		.when().put("/maps/api/place/update/json")
		.then().log().all().assertThat().spec(res);
		
//Get method
		
		given().log().all().spec(request).queryParam("place_id", placeid)
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().spec(res);
		

	}

}
