package Screens.ios;

import Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HelpScreen extends ScreenBase{
	
	public HelpScreen(IOSDriver driver){
	super(driver);
	}
	
	@iOSFindBy(id="Skip")
	public MobileElement skip;
	
	//Need to add Swipe Method
	
	public HelpScreen ViewScreen(){
		skip.click();
		return this;
		
	}
	
}
