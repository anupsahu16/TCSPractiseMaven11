package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegitrationFromTest {

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title = br.getTitle();
		System.out.println("login page title: " + title);
		
		By FirstName = By.id(title);
		
		

	}

}
