package Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropJQueryElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/slider/");

		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        
        Actions action = new Actions(driver);
        
        // Hard coding the width and then sliding the element
		// action.dragAndDropBy(slider, 200, 0).perform();
	    
        
        // Dynamically getting the width of the element and sliding the element
        WebElement sliderMenu = driver.findElement(By.id("slider"));
		int width = sliderMenu.getSize().width/2;
		action.dragAndDropBy(slider, width, 0).perform();
	}

}
