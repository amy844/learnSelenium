package TestNGGroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingRegressionGroup {

	@Test(priority = 1, groups = "regression")
	public void regressionTestRegister() {
		System.out.println("User Register");
		Assert.fail("User not Exists");
	}

	@Test(priority = 2, dependsOnMethods = "regressionTestRegister", alwaysRun = true, groups = "regression")
	public void regressionTestLogin() {
		System.out.println("Login User");
	}

	@Test(priority = 3, groups = "regression")
	public void regressionTestPasswordLink() {
		System.out.println("Changed User Password");
		Assert.fail("Password not changed");
	}

	@Test(priority = 4, groups = "regression")
	public void regressionTestGrantAdminAccess() {
		System.out.println("Granted Admin Permission");
	}

	@Test(priority = 5, dependsOnMethods = { "regressionTestRegister", "regressionTestPasswordLink" }, groups = {
			"somke" })
	public void regressionTestCreateEmail() {
		System.out.println("Granted Admin Permission");
	}

}
