package Base;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Screens.ios.ForgotPasswordScreen;
import Screens.ios.GetStartedScreen;
import Screens.ios.HomeScreen;
import Screens.ios.LoginScreen;


import Screens.ios.NewGetStartedScreen;
import Utils.CommonUtils;
import Utils.ExtentManager;
import io.appium.java_client.ios.IOSDriver;


public class TestBase {
	
	public static IOSDriver driver;
	public static String loadPropertyFile="iOS_Quickee.properties";
	
	public GetStartedScreen gs;
	public LoginScreen ls;
	public NewGetStartedScreen Ngs;
	public ForgotPasswordScreen FPs;
	public HomeScreen Hs;
	
	public Logger log= Logger.getLogger("devpinoyLogger");
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	

	
	@BeforeSuite
	public void setUp() throws IOException{
		
		if(driver == null){
			
			if(loadPropertyFile.startsWith("iOS")){
				
				CommonUtils.loadIOSConfigProp(loadPropertyFile);
				log.debug("Loading IOS Property File");
				
				CommonUtils.setIOSCapabilities();
				
				driver = CommonUtils.getIOSDriver();
			}
			
			
			
		}
		
	}
	public void MethodSwipeUp(int durations){
		
		Dimension	size = driver.manage().window().getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		 int startx= width/2;
		int starty=(int)(height * 0.60);
		
		int endy=(int)(height *0.10);
		
		driver.swipe(startx, starty, startx, endy, durations);
		
	}

	
	
	@AfterSuite
	public void tearDown(){
		log.debug("Quit the Browser");
		driver.quit();
		
	}
}
