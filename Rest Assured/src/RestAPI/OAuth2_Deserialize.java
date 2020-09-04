package RestAPI;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POJO.Getcourses;
import POJO.webAutomation;

public class OAuth2_Deserialize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

//Get the course details using the Access token	
	Getcourses gs=	given().queryParam("access_token", "ya29.a0AfH6SMAHf9uapAWJDmSPBS5h0S532jaYZmEls3FXuU8hmrQcPu-7MosDgfK06baxDtDjrzivOsMc_4B4tfjijIYFGqszybx-xxtdv5IKAHjQFoJirLHZ4OQZuaphaLrTmVxbjOXtoHIaWfz7rSKZe5dOg8emGkYK67bx")
			.expect().defaultParser(Parser.JSON)
		.when().get("https://rahulshettyacademy.com/getCourse.php").as(Getcourses.class);
	System.out.println(gs.getInstructor());
	System.out.println(gs.getLinkedIn());
	System.out.println(gs.getUrl());
	List<webAutomation> coursetitle = gs.getCourses().getWebAutomation();
	for(int i=0;i<coursetitle.size();i++)
	{
		System.out.println(coursetitle.get(i).getCourseTitle());
	}
		
	}

}
