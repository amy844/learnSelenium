package CheckboxHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClickingUsingList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement block = driver.findElement(By.xpath("//table/tbody/tr/td/div[4]"));
		List<WebElement> checkbox = block.findElements(By.name("sports"));
		for (WebElement checkboxes : checkbox) {
			checkboxes.click();
		}
	}

}
