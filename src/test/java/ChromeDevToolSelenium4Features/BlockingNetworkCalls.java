package ChromeDevToolSelenium4Features;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.network.Network;
 
import com.google.common.collect.ImmutableList;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class BlockingNetworkCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();

		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.setBlockedURLs(ImmutableList.of("*.jpg", ".png", "*.jpeg")));

		driver.get("http://makemytrip.com");
	}

}
