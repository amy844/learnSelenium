package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/resizable/");
//      List<WebElement> frame = driver.findElements(By.tagName("iframe"));
//      System.out.println(frame.size());

		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("//*[@id=\"resizable\"]"));

		Actions action = new Actions(driver);

		action.dragAndDropBy(resize, 400, 0).perform();

	}

}
