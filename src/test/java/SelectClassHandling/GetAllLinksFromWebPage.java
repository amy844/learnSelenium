package SelectClassHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinksFromWebPage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href]"));
		System.out.println(allLinks.size());
		for(WebElement allLink : allLinks)
		{
			System.out.println(allLink.getText()+ " URL:- " +allLink.getAttribute("href"));
		}
	}

}
