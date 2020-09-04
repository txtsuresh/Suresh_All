package testNG_Practise;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SME_Broker {
	
	
	@BeforeTest
	public void SMEbrokerlogin()
	{
		System.out.println("SME Broker Login Sucess");
	}
	
	@Test(groups={"logout"})
	public void SMEbrokerlogout()
	{
		System.out.println("SME Broker Logout Sucess");
		
	}
	@AfterSuite
	public void SMEbrokerhomepage ()
	{
		System.out.println("SME Broker Home page");
	}
	
	@Test
	public void SMEbrokerSIC()
	{
		System.out.println("SME Broker SIC Sucess");
	}

	
}
