package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEventHandling {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
	    
        WebElement resource = driver.findElement(By.xpath("//*[@id=\"menu-item-27617\"]/a/span[2]"));
        
        Actions action = new Actions(driver);
        action.moveToElement(resource).perform();
        driver.findElement(By.xpath("//*[@id=\"menu-item-27618\"]")).click();
	
	}
	

}
