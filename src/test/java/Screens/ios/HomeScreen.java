package Screens.ios;

import Base.ScreenBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomeScreen extends ScreenBase{
	
	public HomeScreen(IOSDriver driver){
		
		super(driver);
	}
	
	//Header elements
@iOSFindBy(id="icon bell")
public MobileElement icon;


//First post Elements


}
