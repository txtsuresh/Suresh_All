package Repository;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReport {
	
	
	public ExtentReports getreports()
	{
		String path = System.getProperty("user.dir")+ "\\report\\reprt.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Results");
		reporter.config().setReportName("Sunlife Automation Scripts");
		
		ExtentReports report = new ExtentReports ();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Suresh Ganesan");
		return report;
		
	}

}
