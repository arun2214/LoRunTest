package LocalTest.RunLocalTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;


/**
 * 
 */
public class TestBase {
	

    protected WebDriverWait wait;

    //Do the test setup
    @BeforeMethod
    @Parameters(value={"browser"})
    public void setupTest (@Optional String browser) throws MalformedURLException, InterruptedException {
        //Set & Get ThreadLocal Driver with Browser
        TLDriverFactory.setTLDriver(browser);
       // wait = new WebDriverWait(TLDriverFactory.getTLDriver(), 15);
       
       System.setProperty("webdriver.chrome.driver","C:\\Selenium Installation process\\chrome\\s\\chromedriver.exe");
       Thread.sleep(5000);
       // int s=15 ;
		//WebDriverWait wait = new WebDriverWait(TLDriverFactory.getTLDriver(),15);
    }
    public String getScreenShotpath(String TestCaseName,WebDriver driver) throws IOException {
		 TakesScreenshot ts =(TakesScreenshot)driver;
	     File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     String Dest = System.getProperty("user.dir")+"\\Reports\\"+TestCaseName+".png";
	     
	    // String errflpath = Dest.getAbsolutePath();
	     File file = new File(Dest);
	     FileUtils.copyFile(scrFile, file);
	     return Dest;
	
	     }

    @AfterMethod
    public synchronized void tearDown() throws Exception {
        TLDriverFactory.getTLDriver().quit();
    }

}