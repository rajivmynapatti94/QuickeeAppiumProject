package Base;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScreenBase {

	public  IOSDriver driver;
	
	public ScreenBase(IOSDriver driver){
		
	this.driver = driver;
	loadElements();
	
	}
	
	public void loadElements(){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void hidekeyboard(){
	//Keyboard will hide
		driver.hideKeyboard();

	}
	
	/*public boolean isElementPresent(WebElement ele){
		
		try{
			driver.findElement((By) ele);
			return true;
		}
		catch(NoSuchElementException e){
			return false;
			
		}*/
	}
	

