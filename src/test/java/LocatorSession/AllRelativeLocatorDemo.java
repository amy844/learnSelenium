package LocatorSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AllRelativeLocatorDemo {

	/* Relative Locator:- above, below, near , toRightOf , toLeftOf */
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// code for above Relative locator 
		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("abcdef@gmail.com");

		// code for below Relative locator
		WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("delhi");
		
		// code for near Relative locator
		//WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
		//near.click();
		
		// code for toRightOf Relative locator
		WebElement rightOf = driver.findElement(RelativeLocator.with(By.xpath("//input[@name='password']")).toRightOf(By.tagName("label")));
		rightOf.sendKeys("delhi");
		
		// code for toLeftOf Relative locator
		WebElement leftOf = driver.findElement(RelativeLocator.with(By.linkText("Signin")).toRightOf(By.xpath("//input[@type='submit']")));
		leftOf.click();
		
	}
}
