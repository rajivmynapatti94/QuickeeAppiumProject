package Screens.ios;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.ScreenBase;
import io.appium.java_client.ios.IOSDriver;

public class NewGetStartedScreen extends ScreenBase{
	
	public NewGetStartedScreen(IOSDriver driver){
		super(driver);
		
	}

	
	public void GetElement() throws InterruptedException{
		
		System.out.println("Waiting for Dialogs");
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();
	        System.out.println("Tap on ALLOW");
	    } catch (Exception e) {
	        System.err.println("no alert visible after 10 sec.");
	    }
	   
	    driver.findElementByName("Login").click();
		Thread.sleep(3000);

	}
}
