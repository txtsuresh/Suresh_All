package RestAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import POJO.GetAddress;
import POJO.location;

public class GoogleAPI_Serialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAddress GA= new GetAddress();
		GA.setAccuracy(50);
		GA.setName("Frontline house");
		GA.setPhone_number("(+91) 983 893 3937");
		GA.setAddress("77, Davisville Street, Toronto");
		GA.setWebsite("http://google.com");
		GA.setLanguage("French-IN");
		List<String> typevalue = new ArrayList<String>();
		typevalue.add("shoe park");
		typevalue.add("shop");
		GA.setTypes(typevalue);
		location l = new location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		GA.setLocation(l);
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").log().all().body(GA)
		.when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("status", equalTo("OK")).extract().asString();
		System.out.println(response);

	}

}
