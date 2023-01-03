package CaptureScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshotForPage {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		if (driver instanceof FirefoxDriver) {
			File fullPageScreenshot = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fullPageScreenshot, new File("./Screenshots/fullPageScreenshot.jpg"));

		} else if (driver instanceof ChromeDriver) {

			File webpage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(webpage, new File("./Screenshots/webpage.png"));
		}

		// WebElement name = driver.findElement(By.xpath("//input[@name='name']"));

		System.out.println("screenshot taken");
	}
}
