package ChromeDevToolSelenium4Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.security.Security;


public class BadSSL {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();

		devTools.send(Security.enable());
		devTools.send(Security.setIgnoreCertificateErrors(true));

		driver.get("https://expired.badssl.com");
	}

}
