package RestAPI;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class purchaseDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String response = "{\r\n" + 
				"\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"\"courses\": [\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\r\n" + 
				"\"price\": 50,\r\n" + 
				"\r\n" + 
				"\"copies\": 6\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\r\n" + 
				"\"price\": 40,\r\n" + 
				"\r\n" + 
				"\"copies\": 4\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\r\n" + 
				"\"price\": 45,\r\n" + 
				"\r\n" + 
				"\"copies\": 10\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"]\r\n" + 
				"\r\n" + 
				"}";

		JsonPath data=new JsonPath(response);
//Print No of courses returned by API
		int coursescount = data.getInt("courses.size()");		
		System.out.println(coursescount);

//Print Purchase Amount
	for(int i=0;i<coursescount;i++)
		{
			int price = data.get("courses["+i+"].price");
			System.out.println(price);
		}
//Print Title of the first course
	String firstcourse = data.get("courses[0].title");
	System.out.println(firstcourse);

//Print All course titles and their respective Prices
	for(int i=0;i<coursescount;i++)
	{
		String title = data.get("courses["+i+"].title");
		int price = data.get("courses["+i+"].price");
		System.out.println(title +"  "+ price);
	}
	
//Print no of copies sold by RPA Course

	for(int i=0;i<coursescount;i++)
	{String coursename = data.get("courses["+i+"].title");
		if(coursename.equalsIgnoreCase("RPA"))
		{
			int copies = data.get("courses["+i+"].copies");
		System.out.println(copies);
		break;	
		}

//Verify if Sum of all Course prices matches with Purchase Amount
		
		int purchaseAmount= data.getInt("dashboard.purchaseAmount");
		int sum =0;
		for(int j=0;j<coursescount;j++)
		{
			int price = data.get("courses["+j+"].price");
			int copies = data.get("courses["+j+"].copies");
			int finalprice = price * copies;
			sum = sum + finalprice;
		}
		System.out.println(sum);
		
		Assert.assertEquals(purchaseAmount, sum);
		
	}
	
		
	}

}
