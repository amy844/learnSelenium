package CaptureScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWithTimeStamp {

	public static WebDriver driver;

	public static void screenShotCapture() throws IOException {

		Date d = new Date();
		String filename = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D://Selenium//LearnSelenium//Screenshots//"+filename));

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		screenShotCapture();
	}

}
