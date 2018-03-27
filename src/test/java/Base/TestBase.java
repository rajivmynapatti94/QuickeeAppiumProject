package Base;

import java.io.IOException;

import org.apache.log4j.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Screens.ios.GetStartedScreen;
import Screens.ios.LoginScreenTest;
import Screens.ios.NewGetStartedScreen;
import Utils.CommonUtils;
import io.appium.java_client.ios.IOSDriver;


public class TestBase {
	
	public static IOSDriver driver;
	public static String loadPropertyFile="iOS_Quickee.properties";
	public GetStartedScreen gs;
	public LoginScreenTest ls;
	public NewGetStartedScreen Ngs;
	
	public static Logger log= Logger.getLogger("devpinoyLogger");
	
//	public static Logger log = LogManager.getLogger("devpinoyLogger");
	
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

	
	
	@AfterSuite
	public void tearDown(){
		log.debug("Quit the Browser");
		driver.quit();
		
	}
}
