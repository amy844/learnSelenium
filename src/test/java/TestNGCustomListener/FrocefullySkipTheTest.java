package TestNGCustomListener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class FrocefullySkipTheTest {

	@Test(priority = 1)
	public void fintionalTestRegister() {
		System.out.println("User Register");
		//Assert.fail("User not Exists");
	}

	@Test(priority = 2, dependsOnMethods = "fintionalTestRegister")
	public void funtionalTestLogin() {
		System.out.println("Login User");
	}

	@Test(priority = 3 )
	public void funtionalTestPasswordLink() {
		System.out.println("Changed User Password");
	}

	@Test(priority = 4)
	public void functionalTestGrantAdminAccess() {
		throw new SkipException("Skipping the methoed Frocefully");
		
	}
}
