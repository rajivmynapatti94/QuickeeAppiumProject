package Screens.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.ScreenBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;


public class GetStartedScreen extends ScreenBase{
	
	public GetStartedScreen(IOSDriver driver){
		
		super(driver);
	}

	

	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Get Started\"]")
	public WebElement getStarted;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"What’s Quickee’s purpose?\"]")
	public WebElement what_Quickee_Response_link;
	
	@iOSFindBy(id="Login")
	public WebElement login;
	
	public GetStartedScreen goToLoginScreen() {
		

		System.out.println("Waiting for Dialogs");
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        driver.switchTo().alert().accept();
	        System.out.println("Tap on ALLOW");
	    } catch (Exception e) {
	        System.err.println("no alert visible after 10 sec.");
	    }
	    
/*Assert.assertTrue(isElementPresent(login), "Element is not found");*/
	    login.click();
		return this;
		
	}
	
	
	public void goToGetStartedScreen(){
		getStarted.click();
	}
	
	
	public void goToQuickee_Response_screen(){
		what_Quickee_Response_link.click();
	}
	
}