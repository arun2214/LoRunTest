package LocalTest.RunLocalTest;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

//import org.testng.ITestListener;

public class Listners extends TestBase implements ITestListener {
	
	ExtentReports extent = ExtentReportNG.extentReportsGenerator();
	ExtentTest test;
	
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	//private static ThreadLocal<ExtentReports> extentTest = new ThreadLocal<ExtentReports>();
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.onTestStart(result);
		 test = extent.createTest(result.getMethod().getMethodName());
		 extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		extentTest.get().log(Status.PASS, "This test pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//WebDriver driver = TLDriverFactory.getTLDriver();
		WebDriver driver=TLDriverFactory.getTLDriver();
		 
		extentTest.get().log(Status.FAIL, "This test Failed");
		
		Object testObject = result.getInstance();
		Class cls= result.getTestClass().getRealClass();
		
			try {
				driver = (WebDriver)cls.getDeclaredField("driver").get(testObject);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
		
		
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShotpath(result.getMethod().getMethodName(), driver),result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	//@Override
	/*
	 * public void onTestFailedWithTimeout(ITestResult result) { // TODO
	 * Auto-generated method stub
	 * //ITestListener.super.onTestFailedWithTimeout(result); }
	 */

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		
		extent.flush();
	}
	

}
