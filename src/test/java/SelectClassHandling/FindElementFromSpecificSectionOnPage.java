package SelectClassHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementFromSpecificSectionOnPage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]"));

		List<WebElement> link = block.findElements(By.tagName("a"));
		System.out.println("Link Present in Wikipedia Block " + link.size());
		for (WebElement links : link) {

			System.out.println(links.getText() + "URL:- " + links.getAttribute("href"));
		}

	}

}
