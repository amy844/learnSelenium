package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssetion {

	
	@Test
	public void testingAssestion() {
		
		SoftAssert softAssert = new SoftAssert();

		System.out.println("Test cases executing");
		String actual = "Google.com"; // getting from excel sheet
		String expected = "Yahoo.com"; // getting from web driver
		System.out.println("Validation title");
		softAssert.assertEquals(actual, expected); // this is hard assestion

		// isElementPresent can be true or false
		// Assert.assertTrue(true, "Element Found on Page");
		// Assert.assertFalse(false, "Element not found");

		System.out.println("Validation Image");
		softAssert.assertEquals(true, false , "Image is not present");
		
		System.out.println("Validation message");
		softAssert.assertEquals(true, false, "Test message not present");
		
		softAssert.fail("Expected condition was not matched");
		
		softAssert.assertAll();
		System.out.println("Test cases ending");
	}

}
