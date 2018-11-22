package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HosaClass {

	@Test
	public void hosa(){
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/report.html");
		ExtentReports ex = new ExtentReports();
		ex.attachReporter(reporter);
		ExtentTest et = ex.createTest("et");
		et.log(Status.INFO, "hiee");
		et.log(Status.PASS, "passssssss");
		ex.flush();
	}
}
