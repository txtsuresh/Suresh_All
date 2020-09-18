package StepDefinations;


import StepDefinations.stepDefintions;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@GetMethod")
		public void Getdata() throws Throwable {
		
	//	if("pla")
			stepDefintions data=new stepDefintions();
			data.user_has_api_endpoint_keyvalue_with("Yaanvi", "kovil thottam", "Tamil");
			data.user_performs_Post_action();
	}
	

		
	

}
