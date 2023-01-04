package BrowserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium 3.0\\exeFiles\\chromedriver.exe");
	//	setProperty method is not required when we add the browser executable file at project root level
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
