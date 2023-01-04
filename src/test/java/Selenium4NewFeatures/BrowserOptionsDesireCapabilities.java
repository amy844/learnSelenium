package Selenium4NewFeatures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOptionsDesireCapabilities {

	public static WebDriver driver;
	public static ChromeOptions opt;

	public static void executeCodeWithoutOpenBrowser() {

		opt = new ChromeOptions();

//	    to execute the code without opening the browser
		opt.addArguments("--headless");

		driver = new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		System.out.println(driver.getTitle());

	}

	public static void openIncognitoWindow() {

		opt = new ChromeOptions();

//	    to Open the incognito window
		opt.addArguments("incognito");

		driver = new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		System.out.println(driver.getTitle());

	}

	public static void openWebsiteWithoutSSLCertificate() {

		opt = new ChromeOptions();

//	    to Open the insecure website
		opt.setAcceptInsecureCerts(true);

		driver = new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

	public static void openBrowserInCustomDimension() {

		opt = new ChromeOptions();

//	    to Open browser in custom dimention 
		opt.addArguments("window-size=600,600");

		driver = new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		System.out.println(driver.getTitle());

	}

	public static void removeInfoTabFromWebsite() {

		opt = new ChromeOptions();

//	    to Open the insecure website
		opt.addArguments("incognito");
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        
        
//		 OR     opt.addArguments("disable-infobars");
		
		
		driver = new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		System.out.println(driver.getTitle());

	}

	public static void openWebsiteInMobileView() {
		
		Map<String, String> mobileEm = new HashMap<String, String>();
		mobileEm.put("deviceName", "iPhone X");

//	    to Open the insecure website
		opt.setExperimentalOption("mobileEmulation", mobileEm);
		
		driver = new ChromeDriver(opt);
		driver.get("https://selenium.dev/");
		System.out.println(driver.getTitle());

	}

	public static void main(String[] args) {

//		BrowserOptionsDesireCapabilities.executeCodeWithoutOpenBrowser();
//		BrowserOptionsDesireCapabilities.openIncognitoWindow();
//		BrowserOptionsDesireCapabilities.openWebsiteWithoutSSLCertificate();
//		BrowserOptionsDesireCapabilities.removeInfoTabFromWebsite();
//		BrowserOptionsDesireCapabilities.openBrowserInCustomDimension();
		BrowserOptionsDesireCapabilities.openWebsiteInMobileView();

		
		



	}

}
