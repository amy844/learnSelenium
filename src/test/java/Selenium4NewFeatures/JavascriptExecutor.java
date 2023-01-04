package Selenium4NewFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecutor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick");
        driver.switchTo().frame(0);
        
		// ((JavascriptExecutor) driver).executeScript("myFunction()");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("myFunction()");
		
		//Below code is to highlight the button
//		js.executeScript( "argument[0].style.border= '3px solid red'", driver.findElement(By.xpath("//button[@text(), 'on click']")));
	}

}
