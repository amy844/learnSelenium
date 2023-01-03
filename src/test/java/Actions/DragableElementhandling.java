package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragableElementhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/draggable/");

		driver.switchTo().frame(0);

		WebElement dragItem = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

		Actions action = new Actions(driver);
        action.dragAndDropBy(dragItem, 200, 0).perform();
	}

}
