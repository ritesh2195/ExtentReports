	package EPack;

	import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
	
	public class ExtentReport1 {
	
	 public static ExtentReports getInstance() {
		 
	 Date date=new Date();
	 
	 String fileNameType=date.toString().replace(" ", "_").replace(":", "_")+ ".html";
	 
	 String reportFilePath="reports//"+fileNameType;
	 
	 ExtentReports eReport=new ExtentReports(reportFilePath, true, DisplayOrder.NEWEST_FIRST);
	 
	 File reportConfigFile=new File("ReportsConfig.xml");
	 
	 eReport.loadConfig(reportConfigFile);
	 
	 eReport.addSystemInfo("TestNG Version", "7.0.0").addSystemInfo("WebDriver Version", "3.141.59")
	 
	 .addSystemInfo("Enviroment", "Staging QA").addSystemInfo("Executed By", "Ritesh");
	 
	 return eReport;
		 
		 
	 }
	}
