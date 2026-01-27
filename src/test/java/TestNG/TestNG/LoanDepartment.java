package TestNG.TestNG;
import org.testng.annotations.*;


public class LoanDepartment {
	@Test(enabled=true)
	public void WebLoginPersonalLoan() {
		System.out.println("This is WebLoginPersonalLoan");
	}
	@Test
	public void APILoginPersonalLoan() {
		System.out.println("This is APILoginPersonalLoan");
	}
	@Test(enabled=true)
	public void MobileLoginPersonalLoan() {
		System.out.println("This is MobileLoginPersonalLoan");
	}
	@Test
	public void WebLoginAutomobileLoan() {
		System.out.println("This is WebLoginPersonalLoan");
	}
	@Test
	public void APILoginAutomobileLoan() {
		System.out.println("This is APILoginPersonalLoan");
	}
	@Test
	public void MobileLoginAutomobileLoan() {
		System.out.println("This is MobileLoginPersonalLoan");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("This is After Test");

	}

}
