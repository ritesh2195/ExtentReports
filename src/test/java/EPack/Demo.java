	package EPack;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
	
	public class Demo {
		
	ExtentReports eRep;
	ExtentTest eTest;	
	
	 @Test
	 public void testOmayo() {
		 
	 eRep=ExtentReport1.getInstance();
	 
	 eTest=eRep.startTest("Test omayo ");
	 
	 eTest.log(LogStatus.INFO, "Test omayo started here");
	 
	 System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 eTest.log(LogStatus.INFO, "Chrome browser got launched");
	 
	 driver.manage().window().maximize();
	 
	 eTest.log(LogStatus.INFO, " browser got maximized");
	 
	 driver.get("http://omayo.blogspot.com/");
	 
	 eTest.log(LogStatus.INFO, "opened the url");
	 
	 String ExpectedText="PracticeAutomationHere";
	 
	 String ActualText=driver.findElement(By.id("pah")).getText();
	 
	 if(ActualText.equals(ExpectedText)) {
		 
		 System.out.println("Required text is displayed on the application");
		 
		 eTest.log(LogStatus.PASS, "Required text got displayed on the application");
	 }
	 else {
		
		 System.out.println("Required text is not displayed on the application");
		 
		 eTest.log(LogStatus.FAIL, "Required text is not displayed on the application");
	 }
	   }
	 
	 @AfterMethod
	 public void testClosure() {
		 
	 eRep.endTest(eTest);
	 
	 eRep.flush();
		 
	 }
	 
	}
