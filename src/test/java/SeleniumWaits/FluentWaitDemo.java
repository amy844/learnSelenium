package SeleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get(
				"https://accounts.google.com/v3/signin/identifier?dsh=S-670380921%3A1671169311204715&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh4e_gmN266O0_IsdpyJBoHQwRSgR8l04vpcP2fU_vCQBIEDaJWYU4G-HQigQhg7kBsw3Uc6");

		// code to maximize the windoe
		driver.manage().window().maximize();

		// code to add the implicite wait in Selenium 4.7.2
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");

		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        //		driver.manage().window().minimize();
        //		driver.manage().window().fullscreen();

		// code to add the Fluent wait in Selenium 4.7.2
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).withMessage("Time out as specific condition not met")
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")))
				.sendKeys("aaaaa");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();

		System.out.println(driver
				.findElement(By.xpath(
						"//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div[1]/div/form/span/div[1]/div[2]/div[2]/span"))
				.getText());
	}
	/* The Fluent wait to over come the Explicit and Implicit Wait drawback */
}
