package Screens.ios;

import Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class GetAgreeScreen extends ScreenBase{
	
	public GetAgreeScreen(IOSDriver driver){
		super(driver);
		
	}
	
	@iOSFindBy(id="Terms of Service and Privacy Policy.")
	public MobileElement Terms_Conditons_Link;
	
	@iOSFindBy(id="Agree & Continue")
	public MobileElement AgreeButton;
	
	@iOSFindBy(id="Login")
	public MobileElement Login_Link;
	
	public GetAgreeScreen Agreescreen(){
		
		//Need to work on the TestCases and then we will add locator and their functionality.
		
		return this;
	}
	

}
