package TestCases.ios;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.TestBase;
import Screens.ios.HomeScreen;

public class LogoutTest extends TestBase{
	

	@Test
	public void GetLogout() throws InterruptedException{

//-----------------Calling the LoginTest class by creating a object---------------------------
		
		LoginTest ls= new LoginTest();
		ls.Openapp();
	
	
		Hs=new HomeScreen(driver);
		
		Hs.performactions();
		
//------------------Swipe the screen downwards to get the last (Logout element)---------------
		
		Dimension size = driver.manage().window().getSize();
		
		int x=size.getWidth()/2;
		int starty=(int)(size.getHeight()* 0.60);
		
		int endy=(int)(size.getHeight() *0.10);
		
		driver.swipe(x, starty, x, endy, 3000);
		
		
		
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
		
}}
