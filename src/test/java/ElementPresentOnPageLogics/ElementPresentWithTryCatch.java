package ElementPresentOnPageLogics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentWithTryCatch {

// in this approach drawback is we need to create different methods for each locator for xpath, tagname, class name, id etc
// Here created the two separated methods for xpath and tagname
	public static WebDriver driver;

	public static boolean isElementPresetByXpath(String locator) {

		try {
			driver.findElement(By.xpath(locator));
			return true;
		} catch (Throwable t) {
			return false;
		}
	}

	public static boolean isElementPresetByTagName(String locator) {

		try {
			driver.findElement(By.tagName(locator));
			return true;
		} catch (Throwable t) {
			return false;
		}
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(isElementPresetByXpath("//span[@class='central-textlogo__image']"));
		System.out.println(isElementPresetByTagName("select"));
	}
}
