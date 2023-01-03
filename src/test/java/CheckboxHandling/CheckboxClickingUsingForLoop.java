package CheckboxHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxClickingUsingForLoop {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		for (int i = 1; i <= 4; i++) {
			driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
		}
	}
}
