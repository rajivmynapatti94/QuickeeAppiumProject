package Utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.google.common.io.Files;

import Base.TestBase;

public class TestUtils extends TestBase{
	
	public static String screenshotName;
	public static String screenshotPath;
	public ExcelReader excel;
	
	public static String captureScreenshot() throws IOException {
	

		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
	
		screenshotName = d.toString().replace(":", "_").replace(" ", "_")+" .jpg";
	
		Files.copy(scrFile, new File(System.getProperty("user.dir")+"/target/surefire-reports/"+screenshotName));
		return screenshotName;

		
		} 
	
	@DataProvider
	public Object[][] getData(String sheetName){
		
		int row=excel.getRowCount(sheetName);
		int cells=excel.getColumnCount(sheetName);
		
		
		
		return null;
		
		
	}
		
}


