package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		By langLinks = By.xpath("//div[@id='SIvCob']/a");
		doLinkClick(langLinks, "मराठी");
		

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doLinkClick(By locator, String value) {
		List<WebElement> langLinks= getElements(locator);
		for(int i = 0 ; i <langLinks.size();i++) {
			String Googlelang = langLinks.get(i).getText();
			System.out.println(Googlelang);
			if(Googlelang.equals(value)) {
				langLinks.get(i).click();
				break;
			}
		}
	}
	
	
}
