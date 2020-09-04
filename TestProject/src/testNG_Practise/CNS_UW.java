package testNG_Practise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CNS_UW {
	
	@BeforeMethod
	public void CNSUWlogin()
	{
		System.out.println("CNS UW Login Sucess");
	}
	
	@Test(groups={"logout"})
	public void CNSUWlogout()
	{
		System.out.println("CNS UW Logout Sucess");
		
	}
	@Test
	public void CNSUWhomepage ()
	{
		System.out.println("CNS UW Home page");
	}

}
