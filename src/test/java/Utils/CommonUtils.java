package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {
	
	public static int IMPLICIT_WAIT;
	public static int APPIUM_SERVER_PORT;
	public static String APPLICATION_APP;
	public static String UDID;
	public static String AUTOMATION_INSTRUMENTATION;
	public static String BROWSER_NAME;
	public static String PLATFORM_NAME;
	public static String DEVICE_NAME;
	public static String PLATFORM_VERSION;
	public static Properties prop =new Properties();
	public static DesiredCapabilities capabilities= new DesiredCapabilities();
	public static URL serverUrl;
	public static IOSDriver driver;
	
	
	public static void loadIOSConfigProp(String propertyFileName) throws IOException{
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Properties/"+ propertyFileName);
		prop.load(fis);
		
		IMPLICIT_WAIT= Integer.parseInt(prop.getProperty("implicit.wait"));
		APPIUM_SERVER_PORT= Integer.parseInt(prop.getProperty("appium.server.port"));
		APPLICATION_APP = prop.getProperty("application.app");
		UDID= prop.getProperty("udid");
		AUTOMATION_INSTRUMENTATION= prop.getProperty("automation.instrumentation");
		BROWSER_NAME= prop.getProperty("browser.name");
		PLATFORM_NAME= prop.getProperty("platform.name");
		DEVICE_NAME= prop.getProperty("device.name");
		PLATFORM_VERSION= prop.getProperty("platform.version");
		
	}

	public static void setIOSCapabilities(){
		
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, CommonUtils.BROWSER_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, CommonUtils.PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, CommonUtils.DEVICE_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, CommonUtils.PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, CommonUtils.AUTOMATION_INSTRUMENTATION);
		capabilities.setCapability(MobileCapabilityType.APP, CommonUtils.APPLICATION_APP);
		capabilities.setCapability(MobileCapabilityType.UDID, CommonUtils.UDID);
		
		
	}
	
	public static IOSDriver getIOSDriver() throws MalformedURLException{
		serverUrl = new URL("http://localhost:"+APPIUM_SERVER_PORT + "/wd/hub");
		System.out.println("The ServerUrl path is "+serverUrl);
		driver = new IOSDriver(serverUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
