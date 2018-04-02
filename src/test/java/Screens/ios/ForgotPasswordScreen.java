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
	
	public ForgotPasswordScreen forgotPasswordTest(String email) throws InterruptedException{
		
		forgotPasswordLink.click();
		
		Thread.sleep(3000);
		
		emailTextField.sendKeys(email);
		
		//sendButton.click();
		
		cancelButton.click();
		
		return this;
	}

}
