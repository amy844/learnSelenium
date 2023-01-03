package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println(driver.findElements(By.tagName("frame")).size());

		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//form/table[1]/tbody/tr[2]/td[1]/input")).sendKeys("amit Singh");
		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.switchTo().defaultContent(); // this is used in selenium 3
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//html/body/p[3]/span/a")).click();

//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//*[@id=\"nav_translate_btn\"]/i")).click();
//

		driver.switchTo().parentFrame(); // this is used in selenium 4
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//form/table[1]/tbody/tr[2]/td[1]/input")).sendKeys("Hello frame");
//
//		System.out.println(driver.findElements(By.tagName("iframe")).size());

	}

}
