package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingDependencyOnMethods {
	
	@Test (priority = 1 )
	public void testRegister() {
		System.out.println("User Register");
		Assert.fail("User not Exists");
	}

	@Test(priority = 2,dependsOnMethods = "testRegister")
	public void testLogin() {
		System.out.println("Login User");
	}
	@Test (priority = 3 )
	public void testPasswordLink() {
		System.out.println("Changed User Password");
	}
	@Test (priority = 4)
	public void testGrantAdminAccess() {
		System.out.println("Granted Admin Permission");
	}
}

/*
==========================================
Default test
Tests run: 4, Failures: 1, Skips: 1
==========================================

 */
