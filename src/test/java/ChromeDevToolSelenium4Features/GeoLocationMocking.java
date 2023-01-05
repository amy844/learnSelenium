package ChromeDevToolSelenium4Features;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;
import java.util.Optional;

public class GeoLocationMocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		WebDriver driver = new ChromeDriver();
		DevTools devTools = ((ChromeDriver)driver).getDevTools();
		devTools.createSession();
		
		devTools.send(Emulation.setGeolocationOverride(
                Optional.of(51.509865),
                Optional.of(-0.118092),
                Optional.of(100)));
		
		driver.get("https://mycurrentlocation.net/");

		}
	//devTools.send(Emulation.setGeolocationOverride(Optional.of(51.509865), Optional.of(-0.118092), Optional.of(100)));
	           	
}
