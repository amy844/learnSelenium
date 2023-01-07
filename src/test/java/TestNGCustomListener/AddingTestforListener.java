package TestNGCustomListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingTestforListener {

	@Test(priority = 1, groups = "funtional")
	public void funtionalTestRegister() {
		System.out.println("User Register");
		Assert.fail("User not Exists");
	}

	@Test(priority = 2, dependsOnMethods = "funtionalTestRegister", groups = "funtional")
	public void funtionalTestLogin() {
		System.out.println("Login User");
	}

	@Test(priority = 3, groups = "funtional")
	public void funtionalTestPasswordLink() {
		System.out.println("Changed User Password");
	}

	@Test(priority = 4, groups = "funtional")
	public void functionalTestGrantAdminAccess() {
		System.out.println("Granted Admin Permission");
	}
}

/*
 * ========================================== Default test Tests run: 4,
 * Failures: 1, Skips: 1 ==========================================
 * 
 */
