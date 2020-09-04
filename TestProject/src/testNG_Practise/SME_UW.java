package testNG_Practise;

import org.testng.annotations.Test;

public class SME_UW {
	
	@Test(dependsOnMethods= {"SMEUWlogin"})
	public void SMEUWhomepage ()
		{
		System.out.println("SME UW Home page");
		}
	
	@Test()
	public void SMEUWlogin()
	{
		System.out.println("SME UW Login Sucess");
	}
	
	@Test(enabled= false)
	public void SMEUWSICpage()
	{
		System.out.println("SME UW SIC page");
	}	
	

	
	@Test(groups={"logout"})
	public void SMEUWlogout()
	{
		System.out.println("SME UW Logout Sucess");		
	}
	


}
