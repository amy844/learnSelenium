package ElementPresentOnPageLogics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentWithSize {

	public static WebDriver driver;

	// in this approach drawback is we need to create different methods for each locator for xpath, tagname, class name, id etc
	// Here created the two separated methods for xpath and tagname
	
	public static boolean isElementPresentWithXpath(String locator) {

		int size = driver.findElements(By.xpath(locator)).size();
		System.out.println(size);
		if (size == 0) {
			return false;
		} else
			return true;
	}

	public static void main(String[] args) {

        driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(isElementPresentWithXpath("//*[@id='searchLanguage234']"));
	}
}
