package Screens.ios;

import Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ForgotPasswordScreen extends ScreenBase{
	
	public ForgotPasswordScreen(IOSDriver driver){
		super(driver);
	}
	
	@iOSFindBy(id="Forgot your password?")
	public MobileElement forgotPasswordLink;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"Quickee\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField")
	public MobileElement emailTextField;
	
	@iOSFindBy(xpath="(//XCUIElementTypeButton[@name=\"Send\"])[1]")
	public MobileElement sendButton;
	
	@iOSFindBy(id="Cancel")
	public MobileElement cancelButton;
	
	public ForgotPasswordScreen ValidCredentials(String Valid_email) throws InterruptedException{
		
		forgotPasswordLink.click();
		
		Thread.sleep(3000);
		
		emailTextField.sendKeys(Valid_email);
		
		//sendButton.click();
		
		cancelButton.click();
		
		return this;
	}
	
	public ForgotPasswordScreen InvalidCredentials(String Invalid_email) throws InterruptedException{
		
		forgotPasswordLink.click();
		
		Thread.sleep(3000);
		
		emailTextField.sendKeys(Invalid_email);
		
		sendButton.click();
	//As soon as it click on Sendbutton then a dialog will occur stating that "User email does not exit"--
		//--and user will be not able to click on cancel button untill unless he/she tap on "OK" button in dialog
		cancelButton.click();
		return this;
	}

}
