package Screens.ios;

import Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class WelcomeScreen extends ScreenBase{
	
	public WelcomeScreen(IOSDriver driver){
		super(driver);
		
	}
	
	@iOSFindBy(id="Back Icon")
	public MobileElement back_button;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"Quickee\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField")
	public MobileElement email_field;
	
	@iOSFindBy(id="Sign Up")
	public MobileElement signUp_button;
	
	@iOSFindBy(id="Facebook")
	public MobileElement fb_link;
	
	@iOSFindBy(id="Phone Number")
	public MobileElement phone_button;
	
	
	public WelcomeScreen enterEmail(){
	
		//will add the test cases here soon!!!	
		
		return this;
	}
	
	public WelcomeScreen phonebutton(){
		phone_button.click();
		
		return this;
		
	}

}
