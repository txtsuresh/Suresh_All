package RestAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OAuth2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Kumar\\Downloads\\chromedriver.exe");
//		
//		 WebDriver driver = new ChromeDriver();
//		 System.out.println("test2");
//		 driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=test");
//		 driver.findElement(By.id("identifierId")).sendKeys("sureshtxt@gmail.com");
//		 driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.name("password")).sendKeys("Viyaan@11");
//		 driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
//		String URL= driver.getCurrentUrl();
//		 
//		 String partialcode = URL.split("code=")[1];
//		 String code=partialcode.split("&scope")[0];
//		System.out.println(code);



//Code Needs to be changed every time before running the script
		String token=given().urlEncodingEnabled(false).queryParams("code", "4%2F3gEgHHRHnSIHqOfdcnrfs-2Wq14wvhWC75XJ6PPuPBkiLL8daZwLMV9EHA3g7jPHM2CtNnn6YIeTLiLvQHt3ruk")
		.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type", "authorization_code")
		.queryParams("state", "test")
		.when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
		System.out.println(token);
		
		JsonPath value= new JsonPath(token);
		String accesstoken = value.getString("access_token");
		System.out.println(accesstoken);
		
		given().queryParam("access_token", accesstoken)
		.when().get("https://rahulshettyacademy.com/getCourse.php").then().log().all().statusCode(200);
		
	}

}
