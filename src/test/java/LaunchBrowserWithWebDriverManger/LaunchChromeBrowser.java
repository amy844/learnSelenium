package LaunchBrowserWithWebDriverManger;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
     
	// 1st need to add the webdrivermanager dependency in POM.xml
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		
		
	}
}
