package LaunchBrowserWithoutBrowserExeSelenium_4_7_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {
	
	public static void main(String[] args) {
		
	 WebDriver driver = new EdgeDriver();
		driver.get("http://facebook.com");
	}

}
