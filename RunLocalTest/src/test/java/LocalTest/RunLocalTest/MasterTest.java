package LocalTest.RunLocalTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by ONUR on 03.12.2016.
 */
public class MasterTest extends TestBase {

    @Test
    public void GOOGLE0() throws Exception {
    	
        System.out.println("Google0 Test Started! " + Thread.currentThread().getId());
        TLDriverFactory.getTLDriver().navigate().to(Constant.Url);
        System.out.println("Google0 Test's Page title is: " + TLDriverFactory.getTLDriver().getTitle() + " " + Thread.currentThread().getId());
       // Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Orange");
        System.out.println("Google0 Test Ended! " + Thread.currentThread().getId());
        WebDriver driver=TLDriverFactory.getTLDriver();
        Login.test1_Login(driver);
    }

    @Test
    public void GOOGLE2() throws Exception {
    
        System.out.println("Google2 Test Started! " + Thread.currentThread().getId());
        TLDriverFactory.getTLDriver().navigate().to(Constant.Url);
        System.out.println("Google2 Test's Page title is: " + TLDriverFactory.getTLDriver().getTitle() + " " + Thread.currentThread().getId());
       // Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Orange");
        System.out.println("Google2 Test Ended! " + Thread.currentThread().getId());
        WebDriver driver=TLDriverFactory.getTLDriver();
        Login.test2_Login(driver);
        
    }

    @Test
    public void GOOGLE3() throws Exception {
    	WebDriver driver=TLDriverFactory.getTLDriver();
        System.out.println("Google3 Test Started! " + Thread.currentThread().getId());
        TLDriverFactory.getTLDriver().navigate().to(Constant.Url);
        System.out.println("Google3 Test's Page title is: " + TLDriverFactory.getTLDriver().getTitle() + " " + Thread.currentThread().getId());
        Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Orange");
        System.out.println("Google3 Test Ended! " + Thread.currentThread().getId());
        Login.test3_Login(driver);
    }

    @Test
    public void GOOGLE4() throws Exception {
    	WebDriver driver=TLDriverFactory.getTLDriver();
        System.out.println("Google4 Test Started! " + Thread.currentThread().getId());
        TLDriverFactory.getTLDriver().navigate().to(Constant.Url);
        System.out.println("Google4 Test's Page title is: " + TLDriverFactory.getTLDriver().getTitle() + " " + Thread.currentThread().getId());
        Assert.assertEquals(TLDriverFactory.getTLDriver().getTitle(), "Orange");
        System.out.println("Google4 Test Ended! " + Thread.currentThread().getId());
        Login.test4_Login(driver);
    }

}
