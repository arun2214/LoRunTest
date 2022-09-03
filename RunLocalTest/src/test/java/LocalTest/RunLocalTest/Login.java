package LocalTest.RunLocalTest;

//import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {
	//static By userName1 = By.name("username");
	//static By passWord = By.name("password");
	static By userName1 = By.name("identifier");
	static By passWord = By.name("password");
	static By cLickLogin =By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");	
    

	public static void test1_Login(WebDriver driver) throws Exception  {
		Data_Utility.TestDataInteraction(Constant.Path_TestData + Constant.File_TestData,"Login","TestCase1");
 		String sUserName = Data_Utility.GetObjDict().get("UserName"); 
		String sPassword = Data_Utility.GetObjDict().get("Pass"); 
		String sChannel  = Data_Utility.GetObjDict().get("Transaction");
		//PageObject.sUserName.sendKeys(sUserName);
		//PageObject.sPassword.sendKeys(sPassword);
		driver.findElement(userName1).sendKeys(sUserName);
		//To locate input field for password and enter value
		driver.findElement(passWord).sendKeys(sPassword);
		//To locate and click on login button
		driver.findElement(cLickLogin).click();	
       Thread.sleep(4000);
		System.out.println("Test thread id is for Test1 :"+Thread.currentThread().getId());
		System.out.println("pass");
	}
	
	public static void test2_Login(WebDriver driver) throws Exception  {
		Data_Utility.TestDataInteraction(Constant.Path_TestData + Constant.File_TestData,"Login","TestCase2");
 		String sUserName = Data_Utility.GetObjDict().get("UserName"); 
		String sPassword = Data_Utility.GetObjDict().get("Pass"); 
		String sChannel  = Data_Utility.GetObjDict().get("Transaction");
		driver.findElement(userName1).sendKeys(sUserName);
		//To locate input field for password and enter value
		driver.findElement(passWord).sendKeys(sPassword);
		//To locate and click on login button
		driver.findElement(cLickLogin).click();
		Thread.sleep(4000);
		System.out.println("Test thread id is for Test2 :"+Thread.currentThread().getId());
		System.out.println("pass");
	}

	public static void test3_Login(WebDriver driver) throws Exception  {
		Data_Utility.TestDataInteraction(Constant.Path_TestData + Constant.File_TestData,"Login","TestCase3");
 		String sUserName = Data_Utility.GetObjDict().get("UserName"); 
		String sPassword = Data_Utility.GetObjDict().get("Pass"); 
		String sChannel  = Data_Utility.GetObjDict().get("Transaction");
		driver.findElement(userName1).sendKeys(sUserName);
		//To locate input field for password and enter value
		driver.findElement(passWord).sendKeys(sPassword);
		//To locate and click on login button
		driver.findElement(cLickLogin).click();
          Thread.sleep(4000);
		System.out.println("Test thread id is for Test3 :"+Thread.currentThread().getId());
		System.out.println("pass");
	}
	public static void test4_Login(WebDriver driver) throws Exception  {
		Data_Utility.TestDataInteraction(Constant.Path_TestData + Constant.File_TestData,"Login","TestCase4");
 		String sUserName = Data_Utility.GetObjDict().get("UserName"); 
		String sPassword = Data_Utility.GetObjDict().get("Pass"); 
		String sChannel  = Data_Utility.GetObjDict().get("Transaction");
		driver.findElement(userName1).sendKeys(sUserName);
		//To locate input field for password and enter value
		driver.findElement(passWord).sendKeys(sPassword);
		//To locate and click on login button
		driver.findElement(cLickLogin).click();
        Thread.sleep(4000);
		System.out.println("Test thread id is for Test4 :"+Thread.currentThread().getId());
		System.out.println("pass");
	}

}
