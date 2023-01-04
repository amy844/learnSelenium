package SelectClassHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement dropdown = driver.findElement(By.tagName("select"));

		Select select = new Select(dropdown);
		select.selectByValue("Guinea");
		select.selectByIndex(15);
		select.selectByVisibleText("Canada");
		List<WebElement> allOption = driver.findElements(By.tagName("Option"));
		System.out.println("Total Options in Dropdown " + allOption.size());
        for (WebElement webElement : allOption) {
        	System.out.println(webElement.getText());
        	
			System.out.println(webElement.getAttribute("value"));
			System.out.println("**********");
		
        } 
	}

}
