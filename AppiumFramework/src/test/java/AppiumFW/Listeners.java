package AppiumFW;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Repository.ExtentReport;
import Repository.InvokeApp;



public class Listeners extends InvokeApp implements ITestListener{
	ExtentReport data = new ExtentReport();
	ExtentReports report =  data.getreports();
	ExtentTest test ;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 test = report.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//AndroidDriver<AndroidElement> driver = null;
		 test.log(Status.PASS, "Test Passed");
//		
//	String n=result.getName();
//	
//	try {
//		getScreenshot(n);
//	} catch (IOException | InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	

	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		 test.fail(result.getThrowable());
		String n=result.getName();
		
		try {
			getScreenshot(n);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.flush();
	}

}
