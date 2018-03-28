package Listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import Base.TestBase;
import Utils.TestUtils;

public class CustomListeners extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = rep.startTest(result.getName().toUpperCase());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(LogStatus.PASS, result.getName().toUpperCase() + " Pass");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE){
		
			try {
				String screenshotPath = TestUtils.captureScreenshot();
				
				test.log(LogStatus.FAIL, result.getName().toUpperCase() + " Failed with Exception : " + result.getThrowable());

				test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		rep.endTest(test);
		rep.flush();
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
