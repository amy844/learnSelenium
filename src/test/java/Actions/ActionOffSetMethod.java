package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOffSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

		int x = gmailLink.getRect().getX();
		int y = gmailLink.getRect().getY();

		Actions action = new Actions(driver);
		action.moveByOffset(x, y).click().perform();
	}
}
