package LocalTest.RunLocalTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	static ExtentReports extent;
	
	public static ExtentReports extentReportsGenerator() {
		String Path = System.getProperty("user.dir", "/reports/index.html");
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Execution Analysis");
	    extent = new ExtentReports();
		extent.attachReporter(reporter);
	    extent.setSystemInfo("Tester", "Arun Roy");
	    return extent;
	}

}
