package TestCases.ios;

import org.testng.annotations.Test;

import Base.TestBase;
import Screens.ios.GetStartedScreen;
import Screens.ios.LoginScreen;


public class LoginTest extends TestBase {

	@Test
	public void Openapp() throws InterruptedException{
		
		gs = new GetStartedScreen(driver);
		gs.goToLoginScreen();
		log.debug("Successfully open the login screen");
		
		ls= new LoginScreen(driver);
		
		ls.LoginWithValidCredentials("shivani.gor@indianic.com", "test123");
		log.debug("User is login Successfully");
		
	}
	

}
