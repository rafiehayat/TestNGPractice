package TestNG.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompany {
	@Parameters({"SoftwareCompanyName"})
	@Test
	public void TestCase1(String name) {
		System.out.println(name);
	}

}
