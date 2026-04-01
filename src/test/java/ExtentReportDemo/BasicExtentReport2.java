
package ExtentReportDemo;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class BasicExtentReport2 {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "macOS");
		reports.setSystemInfo("user", "Rafie");
		reports.setSystemInfo("Browser", "Chrome");

		
		htmlReporter.config().setDocumentTitle("Extent Report Demo");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd,yyyy, hh:mm a '('zzz')'");
		
		
	}
	
	@Test
	public void launchBrowserAndOpenURL()
	{
		test = reports.createTest("Launch browser and open URL");
		Assert.assertTrue(true);
	}
	@Test
	public void verifyTitle()
	{
		test = reports.createTest("Verify Title");
		Assert.assertTrue(false);
	}
	@Test
	public void verifyLogo()
	{
		test = reports.createTest("Verify Logo");
		Assert.assertTrue(true);
	}
	@Test
	public void verifyEmail()
	{
		test = reports.createTest("Verify Email");
		throw new SkipException("Skipping this Test Case");
	}
	@Test
	public void verifyUsername()
	{
		test = reports.createTest("Verify Username");
		Assert.assertTrue(true);
	}
}

