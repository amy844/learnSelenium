package LaunchBrowserWithWebDriverManger;

import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {

		// 1st we need to add the webdrivermanager dependency in the POM.xml file
		//WebDriverManager.firefoxdriver().setup();

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com");
	}

}
