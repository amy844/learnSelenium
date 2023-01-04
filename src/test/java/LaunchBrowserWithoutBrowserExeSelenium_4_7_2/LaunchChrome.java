package LaunchBrowserWithoutBrowserExeSelenium_4_7_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
	}
}
