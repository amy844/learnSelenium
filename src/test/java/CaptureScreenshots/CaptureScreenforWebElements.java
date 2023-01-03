package CaptureScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenforWebElements {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		//we are taking the screenshot for the webelement
		File nameScreen = name.getScreenshotAs(OutputType.FILE); 
		// We are creating the screenshot file and folder
		FileUtils.copyFile(nameScreen, new File("./Screenshots/nameScreen.png"));

		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		File phoneScreen = phone.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(phoneScreen, new File("./Screenshots/phoneScreen.png"));

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		File emailScreen = email.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(emailScreen, new File("./Screenshots/emailScreen.png"));

		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		File cityScreenshot = city.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(cityScreenshot, new File("./Screenshots/city.png"));

		System.out.println("screenshot taken");
	}
}
