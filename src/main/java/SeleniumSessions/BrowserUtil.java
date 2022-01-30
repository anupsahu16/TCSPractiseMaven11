package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	WebDriver driver;
	/**
	 * This method is used to intialize driver 
	 * @param browser
	 * @return This method is returning webdriver refrence
	 */
	public WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please pass the correct browser"+browser);
			break;
		}
		return driver;
	}
	
	
	public void launchUrl(String url) {
		System.out.println("url is " + url);
		
		if(url.isEmpty()) {
			System.out.println("url is blank : "+ url);
			return;
		}
		driver.get(url);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		 driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
