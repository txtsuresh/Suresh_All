package Maven.Practise;

import org.testng.annotations.Test;

public class SpiceJetTest extends ChromBrowserTest {
	@Test
	public void spicejet()
	{
		driver.get("https://www.spicejet.com/");
		System.out.println("spicejet displayed");
	}
	

}
