package TestNGGroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingSomkeGroup {

	@Test(priority = 1, groups = "smoke")
	public void smokeTestRegister() {
		System.out.println("User Register");
		Assert.fail("User not Exists");
	}

	@Test(priority = 2, dependsOnMethods = "smokeTestRegister", alwaysRun = false, groups = "smoke")
	public void somkeTestLogin() {
		System.out.println("Login User");
	}

	@Test(priority = 3, groups = "smoke")
	public void smoketTestPasswordLink() {
		System.out.println("Changed User Password");
		Assert.fail("Password not changed");
	}

	@Test(priority = 4, groups = "smoke")
	public void somkeTestestGrantAdminAccess() {
		System.out.println("Granted Admin Permission");
	}

	@Test(priority = 5, dependsOnMethods = { "smokeTestRegister", "smoketTestPasswordLink" }, groups = { "smoke" })
	public void somkeTestCreateEmail() {
		System.out.println("Granted Admin Permission");
	}

}
