package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorksFooterLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By footerXpath = By.xpath("//div[@class='col-md-4 footer-left-section']//a");

		List<WebElement> footerLink = driver.findElements(footerXpath);
		for (WebElement e : footerLink) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
