package BrowserLaunch;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		
//		DesiredCapabilities capabilities =  DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//		
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\Selenium 3.0\\exeFiles\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver(/*capabilities*/);
		driver.get("http://way2automation.com");
	}
}
