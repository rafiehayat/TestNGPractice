package TestNG.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.*;


public class TestNGDemo2 {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("This is before Suite");

	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This is After Suite");

	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("This is before Test");

	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("This is before Class Test");

	}
	@AfterClass
	public void AfterClass() {
		System.out.println("This is After Class Test");

	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This is beforemethodTest");
	}
	@Test
	public void test2() {
		System.out.println("This is Test 2");
	}
	@Test
	public void test3() {
		System.out.println("This is Test 3");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This is AfterMethodTest");
	}

}
