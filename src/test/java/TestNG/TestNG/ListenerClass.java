package TestNG.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	
	public void onStart(ITestContext context) {
        System.out.println("Listener → onStart()");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Listener → onFinish()");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("Listener → onTestStart(): " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Listener → onTestSuccess(): " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Listener → onTestFailure(): " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Listener → onTestSkipped(): " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Listener → onTestFailedButWithinSuccessPercentage(): " 
                           + result.getName());
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Listener → onTestFailedWithTimeout(): " 
                           + result.getName());
    }
}
