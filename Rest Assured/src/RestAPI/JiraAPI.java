package RestAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class JiraAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://testingsuresh.atlassian.net";
		given().relaxedHTTPSValidation().header("Content-Type","application/json")
		.body("{ \"username\": \"sureshtxt@gmail.com\", \"password\": \"suresh@123\" }").when().post("rest/auth/1/session/")
		.then().log().all().statusCode(200);
				

	}

}
