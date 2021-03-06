package TestCases.ios;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.TestBase;
import Screens.ios.ForgotPasswordScreen;
import Screens.ios.GetStartedScreen;
import Screens.ios.HomeScreen;
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
		
//---Below method will be used if we want to text the Login functionality with invalid credentials--------		
	
		//	ls.LoginWithInvalidCredentials("Test@grr.la", "test123");
		
	}
	
	
	@Test(dependsOnMethods="Openapp")
	public void GetLogout() throws InterruptedException{

//-----------------Calling the LoginTest class by creating a object---------------------------
		
		/*LoginTest ls= new LoginTest();
		ls.Openapp();
	*/
	
		Hs=new HomeScreen(driver);
		
		Hs.performactions();
		
//------------------Swipe the screen downwards to get the last (Logout element)---------------
		
						MethodSwipeUp(3000);
		
//-------------After swipe it will tap on the Logout button-----------------------------------
		
		driver.findElementById("Log Out").click();
		

		System.out.println("Waiting for Dialogs");
//-------------Will wait and tap on OK button to confirm the logout.-------------------------------		
	   
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();
	        
	        System.out.println("Tap on Ok");
	        
	    } catch (Exception e) {
	        System.err.println("no alert visible after 10 sec.");
	    }
	System.out.println("User has been logged out successfully");
		
}
	
	
	@Test(dependsOnMethods="GetLogout")
	public void RecoverYourPassword() throws InterruptedException{
		gs = new GetStartedScreen(driver);
		gs.goToLoginScreen();
		
		FPs=new ForgotPasswordScreen(driver);
		
		FPs.ValidCredentials("shivani.gor@indianic.com");
		
		//FPs.InvalidCredentials("Test@grr.la");
	}

}
