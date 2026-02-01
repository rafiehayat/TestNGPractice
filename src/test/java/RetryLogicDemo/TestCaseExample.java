package RetryLogicDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class TestCaseExample {
	
	@Test(retryAnalyzer = RetryAnalyser.class)
	public void TestCase01() {
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void TestCase02() {
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void TestCase03() {
		AssertJUnit.assertTrue(true);
	}
	@Test
	public void TestCase04() {
		AssertJUnit.assertTrue(true);
	}

}
