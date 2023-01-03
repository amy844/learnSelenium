package LaunchBrowserWithoutBrowserExeSelenium_4_7_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
	}
}
