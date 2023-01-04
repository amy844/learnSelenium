package Selenium4NewFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCoordinateUsingRectangleClass {

	public static void main(String[] args) {

		/* Rectangle class is introduce in selenium 4 to get all the things like height,
	       width x axis or y axis. Before selenium 4 we use Dimension and pointer class to do the same
		*/

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement img = driver.findElement(By.xpath("//*[@id=\"logo\"]"));

		Rectangle rect = img.getRect();

		System.out.println("Height : " + rect.getHeight());
		System.out.println("Width : " + rect.getWidth());
		System.out.println("X Coord : " + rect.getX());
		System.out.println("Y Coord : " + rect.getY());

	}

}
