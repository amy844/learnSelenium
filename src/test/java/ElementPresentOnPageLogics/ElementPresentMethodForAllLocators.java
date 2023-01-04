package ElementPresentOnPageLogics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentMethodForAllLocators {

	public static WebDriver driver;

	public static boolean isElementPresentGenericMethod(By by) {
		int size = driver.findElements(by).size();
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

		System.out.println(isElementPresentGenericMethod(By.xpath("//span[@class='central-textlogo__image']")));
		System.out.println(isElementPresentGenericMethod(By.tagName("select")));
	}

}
