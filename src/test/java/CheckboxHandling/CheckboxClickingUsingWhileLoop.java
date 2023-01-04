package CheckboxHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxClickingUsingWhileLoop {

	public static WebDriver driver;

	public static boolean isElementPresent(By by) {
		int size = driver.findElements(by).size();
		if (size == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		int i = 1;
		while (isElementPresent(By.xpath("//div[4]/input[" + i + "]"))) {
			driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
			i++;
		}
		System.out.println(i);
	}

}
