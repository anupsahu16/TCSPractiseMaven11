package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	static WebDriver driver;
	public static void main(String[] args) {
		//WebDriver driver = null;
		String browser = "chrome";
		if(browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C://Users//akank//chromedriver_win32//chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "C://Users//akank//chromedriver_win32//chromedriver.exe");
			WebDriverManager.firefoxdriver().setup(); 
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please pass the correct browser name");
		}
        driver.get("https://www.google.com");
        String title=driver.getTitle();
        System.out.println(title);
        
        driver.quit();
	}

}
