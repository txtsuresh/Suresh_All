package Maven.Practise;

import org.testng.annotations.Test;

public class MakeMyTripTest extends ChromBrowserTest{
	
	@Test
	public void makemytrtip()
	{
		driver.get("https://www.makemytrip.com/");
		System.out.println("makemytrtip displayed");
	}
	

}
