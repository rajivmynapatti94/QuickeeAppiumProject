package TestCases.ios;

import org.testng.annotations.Test;

import Base.TestBase;
import Screens.ios.GetStartedScreen;
import Screens.ios.LoginScreenTest;

public class LoginTest extends TestBase {

	@Test
	public void Openapp() throws InterruptedException{
		
		gs = new GetStartedScreen(driver);
		gs.goToLoginScreen();
		log.debug("Successfuly open the login screen");
		
		ls= new LoginScreenTest(driver);
		
		ls.LoginWithValidCredentials("shivani.gor@indianic.com", "test123");
		log.debug("User is succesfully login");
		
	}
	

}
