package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethodsAlwaysRun {

	@Test (priority = 1 )
	public void testRegister() {
		System.out.println("User Register");
		Assert.fail("User not Exists");
	}

	@Test(priority = 2,dependsOnMethods = "testRegister", alwaysRun= true)
	public void testLogin() {
		System.out.println("Login User");
	}
	@Test (priority = 3 )
	public void testPasswordLink() {
		System.out.println("Changed User Password");
		Assert.fail("Password not changed");
	}
	@Test (priority = 4)
	public void testGrantAdminAccess() {
		System.out.println("Granted Admin Permission");
	}
	
	@Test (priority = 5, dependsOnMethods = {"testRegister","testPasswordLink"})
	public void testCreateEmail() {
		System.out.println("Granted Admin Permission");
	}

}
