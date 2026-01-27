package TestNG.TestNG;
import org.testng.annotations.*;

public class AutomobileClass {
	@Parameters({"AutoMobilename"})
	@Test
	public void TestCase1(String name) {
		System.out.println(name);
	}

}
