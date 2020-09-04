package Maven.Practise;

import org.testng.annotations.Test;

public class youTube extends ChromBrowserTest{
	@Test
	public void youtube()
	{
		driver.get("https://www.youtube.com/");
		System.out.println("Youtube displayed");
	}
	

}
