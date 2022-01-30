package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonFooterLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		By footerAmazon = By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//a");

		List<WebElement> footerLink = driver.findElements(footerAmazon);
		for (WebElement e : footerLink) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
