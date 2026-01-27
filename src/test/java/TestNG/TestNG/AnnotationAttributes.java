package TestNG.TestNG;
import org.testng.annotations.*;

import junit.framework.Assert;


public class AnnotationAttributes {
//	@Test(description = "This is First Test Case")
	@Test(dependsOnMethods = {"test3"})
	public void test1() {
		System.out.println("This is Test 1");
	}
//	@Test(timeOut=200 , priority=3)
	@Test
	public void test2() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is Test 2");
	}
//	@Test(description = "This is Third Test Case",priority=1)
	@Test
	public void test3() {
		System.out.println("This is Test 3");
		Assert.assertTrue(false);
	}
	@Test(enabled=false)
	public void test4() {
		System.out.println("This is Test 4");
	}

}
