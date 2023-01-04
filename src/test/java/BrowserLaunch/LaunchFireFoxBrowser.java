package BrowserLaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		// ctrl + shift + O for importing the class from library

		// Latest selenium version
		// latest browser version FF, IE, Edge etc
		// Latest browser executable file
     //   System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium 3.0\\exeFiles\\geckodriver.exe");
     //	System.setProperty method is not required when we add the browser executable file at project root level
		
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.get("http://way2automation.com");
		
		Thread.sleep(5000);
	    firefox.close();
	}
}
