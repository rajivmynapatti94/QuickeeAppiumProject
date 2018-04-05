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


//Footer elements

@iOSFindBy(id="TabBarItem_Selected_AccessibilityLabel")
public MobileElement feeds;

@iOSFindBy(xpath="(//XCUIElementTypeOther[@name=\"TabBarItem_AccessibilityLabel\"])[1]")
public MobileElement Quickee_Friends;

@iOSFindBy(xpath="(//XCUIElementTypeOther[@name=\"TabBarItem_AccessibilityLabel\"])[2]")
public MobileElement AddNew;

@iOSFindBy(xpath="(//XCUIElementTypeOther[@name=\"TabBarItem_AccessibilityLabel\"])[3]")
public MobileElement Search;

@iOSFindBy(xpath="(//XCUIElementTypeOther[@name=\"TabBarItem_AccessibilityLabel\"])[4]")
public MobileElement Profile;

@iOSFindBy(id="settings icon")
public MobileElement Setting;

public HomeScreen performactions() throws InterruptedException{
	
	Thread.sleep(3000);
	 Profile.click();
	
	Thread.sleep(3000);
	 Setting.click();
	return this;
}

}
