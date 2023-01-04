package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandlingUsingActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://google.com");
		WebElement googleTextField = driver.findElement(By.name("q"));
		// googleTextField.sendKeys("way2automation");
//
		Actions action = new Actions(driver);
//		action.sendKeys(googleTextField, "way2automation");
//		action.sendKeys(Keys.ENTER).perform();
//		action.sendKeys(Keys.DIVIDE).perform();
//		action.sendKeys(Keys.chord(Keys.CONTROL + "a")).perform();

		// Thread.sleep(2000);
//		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();

		// chrod is used to combine the keys like control + a , control+c etc
		// build menthod is used to combone the sendkeys action and then it perform the
		// action

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?dsh=S-1509418051%3A1672648264358134&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh5bCFJFmN3N-t0GTby6FLsOhEfetuB4QidvvtIsXAN_eiFQxEiECl8HhAN7-Zj7SfoLIDXBeg");
		driver.findElement(By.id("identifierId")).sendKeys("singh.amit507@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/div[2]")).click();
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		driver.findElement(By.id("identifierId")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
	}
}
