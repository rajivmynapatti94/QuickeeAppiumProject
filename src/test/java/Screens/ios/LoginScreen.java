package Screens.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.ScreenBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;


public class LoginScreen extends ScreenBase {
	
public LoginScreen(IOSDriver driver){
		
		super(driver);
	}

@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Back Icon\"]")
public	WebElement backButton;
	
@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"Quickee\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField")
	public	WebElement email;
	
@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"Quickee\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public	WebElement password;
	
@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Eye Icon\"]")
	public WebElement viewPassword;
	
@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Forgot your password?\"]")
	public	WebElement forgotPassword;
	
@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Sign In\"]")
	public	WebElement signInButton;
	
@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Facebook\"]")
	public	WebElement fbLink;
	
@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Phone Number\"]")
	public	WebElement phoneNumberLink;
	
@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Welcome Back!\"]")
	public	WebElement WelcomeText;
	
@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"or Sign In with\"]")
	public	WebElement OtherText;

	
	public LoginScreen LoginWithValidCredentials(String uname, String pass) throws InterruptedException{
	
		Thread.sleep(5000);
	email.sendKeys(uname);
	password.sendKeys(pass);
	signInButton.click();
	
	
	System.out.println("Waiting for Dialogs");
    WebDriverWait wait = new WebDriverWait(driver, 10);
    try {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        System.out.println("Tap on ALLOW");
    } catch (Exception e) {
        System.err.println("no alert visible after 10 sec.");
    }
    
    
	System.out.println("I ran this test using Jenkins");
	return this;
	}
	
}
