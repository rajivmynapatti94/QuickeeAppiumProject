package Screens.ios;

import java.util.List;

import org.openqa.selenium.WebElement;

import Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SettingScreen extends ScreenBase{
	
	public SettingScreen(IOSDriver driver){
		super(driver);
	}

	@iOSFindBy(id="Back Icon")
	public MobileElement backButton;
	
	@iOSFindBy(id="Done")
	public MobileElement doneButton;
	
	@iOSFindBy(id="Change Profile Picture")
	public MobileElement ChangeProfilePicturelink;
	
//--------------------------------   Under Information Tag   ----------------------------------------------------
	/*@iOSFindBy()
	public MobileElement
	
	@iOSFindBy()
	public MobileElement
	
	@iOSFindBy()
	public MobileElement
	
	@iOSFindBy()
	public MobileElement
	
	@iOSFindBy()
	public MobileElement
	
	@iOSFindBy()
	public MobileElement
	
	@iOSFindBy()
	public MobileElement
	
	@iOSFindBy()
	public MobileElement*/
	

	
}
