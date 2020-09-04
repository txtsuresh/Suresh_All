package RestAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GoogleAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given- All input details
//When - Submit the API
//Then - Validate the response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
//Post method
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
			.body(RequestBody.Getaddress())
			.when().post("maps/api/place/add/json")
			.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();

	//	System.out.println(response);
		
//Get method
		
		JsonPath js = new JsonPath(response);
		String placeid=js.get("place_id");
		
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid).when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200);
		
//Put method
		given().log().all().queryParam("key", "qaclick123").body("{\r\n" + 
				"\"place_id\":\""+ placeid +"\",\r\n" + 
				"\"address\":\"70 Summer walk, USA\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}\r\n" + 
				"")
		.when().put("/maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200);
		
//Get method
		
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid).when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200);
		

	}

}
