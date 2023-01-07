package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationDemo {

	@BeforeTest
	public void createDBConnection() {
		System.out.println("Connecting DB");
	}

	@AfterTest
	public void closingDBConnection() {
		System.out.println("closing DB");
	}

	@BeforeMethod
	public void lauchBrowser() {
		System.out.println("Launching Browser");

	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("closing the Browser");
	}

	@Test(priority = 1)
	public void testRegistation() {
		System.out.println("Register in the application");
	}

	@Test(priority = 2)
	public void testLogin() {
		System.out.println("Login in the application");
	}

}
