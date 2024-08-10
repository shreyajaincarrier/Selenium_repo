package MavenProject;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport { 
	
	@Test
	public void createReport() {
		String time=LocalDateTime.now().toString().replace(":", "-");
		//step1 :create object for ExtentSparkReporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReport.html");
		
		//step2 : create object for ExtentReport
		ExtentReports extReport=new ExtentReports();
		
		//step3: Attach ExtentsparkReporter to extentsReports
		
		extReport.attachReporter(spark);
		
		//step4: create ExtentTest object
		
		ExtentTest test=extReport.createTest("createReport");
		
		//step5 call log() and provide Status and message
		test.log(Status.INFO, "open browser and navigate to URL");
		test.log(Status.PASS, "enter valid details");
		test.log(Status.WARNING, "click on login details");
        test.log(Status.PASS, "Successfully created extent report");
		
		//step 6: call flush()
		
		extReport.flush();
		
		
	}

}
