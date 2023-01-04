package BrowserLaunch;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchIEBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		
//		DesiredCapabilities capabilities =  DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Selenium 3.0\\exeFiles\\IEDriverServer.exe");
		InternetExplorerDriver iedriver = new InternetExplorerDriver(/*capabilities*/);
		iedriver.get("http://way2automation.com");
		Thread.sleep(5000);
		iedriver.close();

	}

}
