package ChromeDevToolSelenium4Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class OverRiddeTimeZoneValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldtimebuddy.com/");
		
		Thread.sleep(5000);
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Emulation.setTimezoneOverride("EST"));
		driver.get("https://www.worldtimebuddy.com/");
 
	}

}
