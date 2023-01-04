package BrowserLaunch;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabAndWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qa.way2automation.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.google.com");
		// driver.findElement(By.name("q")).sendKeys("hello selenium 4.0");
		System.out.println(driver.getTitle());

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.bookmyshow.com");
		System.out.println(driver.getTitle());

		System.out.println(driver.getWindowHandles().size());

		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterator = winids.iterator();

		List<String> winIndex = new ArrayList<String>();
		while (iterator.hasNext()) {

			winIndex.add(iterator.next());
		}

		 
		driver.switchTo().window(winIndex.get(0));
		System.out.println("First window title is :" + driver.getTitle());

		driver.close();

		driver.switchTo().window(winIndex.get(1));
		System.out.println("second window title is :" + driver.getTitle());

		driver.close();

		driver.switchTo().window(winIndex.get(2));
		System.out.println("third window title is :" + driver.getTitle());

		driver.quit();
	}
}
