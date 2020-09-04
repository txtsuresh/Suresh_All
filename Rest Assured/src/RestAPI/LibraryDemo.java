package RestAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class LibraryDemo {
	
	@Test
	public void library()
	{
		RestAssured.baseURI="http://216.10.245.166";
//Add Book
	String response =given().header("Content-Type", "application/json").body(RequestBody.getlibrary())
		.when().post("Library/Addbook.php")
		.then().log().all().statusCode(200).extract().asString();
//View Book	
	JsonPath data = new JsonPath(response);
	String ID = data.get("ID");
	given().log().all().queryParam("ID", ID).
	when().get("Library/GetBook.php").then().log().all().assertThat().statusCode(200);
			
//Delete Book	
	given().log().all().body("{\r\n" + 
			" \r\n" + 
			"\"ID\" : \""+ID+"\"\r\n" + 
			" \r\n" + 
			"} \r\n" + 
			"").when().delete("/Library/DeleteBook.php").then().log().all().assertThat().statusCode(200);
	}


	

}
