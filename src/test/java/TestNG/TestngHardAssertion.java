package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngHardAssertion {

	@Test
	public void testingAssestion() {

		System.out.println("Test cases executing");
		String actual = "Google.com"; // getting from excel sheet
		String expected = "Yahoo.com"; // getting from web driver
		System.out.println("Validation title");
		Assert.assertEquals(actual, expected); // this is hard assestion

		// isElementPresent can be true or false
		// Assert.assertTrue(true, "Element Found on Page");
		// Assert.assertFalse(false, "Element not found");

		System.out.println("Validation Image");
		Assert.assertEquals(true, false);
		
		System.out.println("Validation message");
		Assert.assertEquals(true, false);
		
		Assert.fail("Expected condition was not matched");
		System.out.println("Test cases ending");
	}

}
