package generic;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	@Test
	public void extent(){
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/report1.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest et = extent.createTest("extent");
		et.log(Status.INFO, "hieeeeeee");
		et.log(Status.PASS, "pass");
		et.log(Status.WARNING, "warninggggggggg");
		extent.flush();
		
	}
}
