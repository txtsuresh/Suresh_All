package RestAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class LibraryDemoParameter {
	
	@Test(dataProvider="getdata")
	public void GetLibrary(String isbn, String aisle) {
		RestAssured.baseURI="http://216.10.245.166";
		String response = given().log().all().body(RequestBody.getlibraryparam(isbn, aisle))
		.when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().asString();
		
		JsonPath value = new JsonPath(response);
		
		String ID= value.get("ID");
		
		given().body("{\r\n" + 
				" \r\n" + 
				"\"ID\" : \""+ID+"\"\r\n" + 
				" \r\n" + 
				"} \r\n" + 
				"").when().delete("/Library/DeleteBook.php").then().log().all().assertThat().statusCode(200);
		
	}

	
	
	@DataProvider()
	public Object[][] getdata()
	{
		Object data [][] = new Object[][]
				{ {"viyaan", "0402"}, {"Suresh", "1101"}, {"Yaanvi", "1208"},{"Selvi", "1709"}};
				return data;
}
}