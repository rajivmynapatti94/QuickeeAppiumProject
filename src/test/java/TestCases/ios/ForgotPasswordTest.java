package TestCases.ios;

import org.testng.annotations.Test;

import Base.TestBase;
import Screens.ios.ForgotPasswordScreen;
import Screens.ios.GetStartedScreen;

public class ForgotPasswordTest extends TestBase{
	
	@Test
	public void RecoverYourPassword() throws InterruptedException{
		gs = new GetStartedScreen(driver);
		gs.goToLoginScreen();
		
		FPs=new ForgotPasswordScreen(driver);
		
		//FPs.ValidCredentials("shivani.gor@indianic.com");
		
		//FPs.InvalidCredentials("Test@grr.la");
	}
	


}
