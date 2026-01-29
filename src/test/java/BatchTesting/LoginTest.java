package BatchTesting;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class LoginTest {
	
	@Test
	public void LoginByMobileNumber() {
		System.out.println("Login By Mobile Number Passed");
	}
	@Test
	public void LoginByEmail() {
		System.out.println("Login By Email Passed");
	}

}
