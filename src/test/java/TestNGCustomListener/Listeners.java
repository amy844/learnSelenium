package TestNGCustomListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {
	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {

		Reporter.log("<a href=\"D://Selenium//LearnSelenium//Screenshots//webpage.png\">"
				+ "<img height= 200 width= 200 src =\"D://Selenium//LearnSelenium//Screenshots//webpage.png\" ></a>");
		Reporter.log("<br>");
		Reporter.log(
				"<a href=\"D://Selenium//LearnSelenium//Screenshots//webpage.png\" target= \"_blank\">Passed Screenshot</a>");

		System.out.println("capturing screenshot for Pass" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("<a href=\"D://Selenium//LearnSelenium//Screenshots//Thu_Jan_05_22_33_34_IST_2023.jpg\">"
				+ "<img height= 200 width= 200 src =\"D://Selenium//LearnSelenium//Screenshots//webpage.png\" ></a>");
		Reporter.log("<br>");
		Reporter.log(
				"<a href=\"D://Selenium//LearnSelenium//Screenshots//Thu_Jan_05_22_33_34_IST_2023.jpg\" target= \"_blank\">Failure Screenshot</a>");
		// Reporter.log("Failure Screenshot");
		System.out.println("capturing screenshot for failure " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("<a href=\"D://Selenium//LearnSelenium//Screenshots//nameScreen.png\" >"
				+ "<img height= 200 width= 200 src =\"D://Selenium//LearnSelenium//Screenshots//webpage.png\" ></a>");
		Reporter.log("<br>");
		Reporter.log(
				"<a href=\"D://Selenium//LearnSelenium//Screenshots//nameScreen.png\" target= \"_blank\">Skipped Screenshot</a>");
		System.out.println("capturing screenshot for Skipped " + result.getName());
	}

	public void onTestFailedButWithinSuccessPresentage(ITestResult result) {
	}

	public void onStart(ITestResult result) {
	}

	public void onFinish(ITestResult result) {
	}
}
