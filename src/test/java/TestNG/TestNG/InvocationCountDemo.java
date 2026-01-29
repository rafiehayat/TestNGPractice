package TestNG.TestNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test(invocationCount = 5)
	public void Testmethod1(ITestContext context) {
		int currentInvocationCount = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("This is Invocation Count " + currentInvocationCount);

		System.out.println("This is Test Method 1");
	}
	@Test(invocationCount = 3)
	public void Testmethod2(ITestContext context1) {
		int currentInvocationCount1 = context1.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("This is Invocation Count " + currentInvocationCount1);
		System.out.println("This is Test Method 2");
	}

}
