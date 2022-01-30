package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		List<WebElement> footerLink= 
				driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']//a[@class='pHiOh']"));
		
		for(int i = 0 ; i < footerLink.size() ; i++) {
			//System.out.println(driver.getTitle());
			footerLink.get(i).click();
			String strTitle= driver.getTitle();
			System.out.println(strTitle);
			driver.navigate().back();
			System.out.println(driver.getTitle());
			
			footerLink= 
					driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']//a[@class='pHiOh']"));
		}
		
	}

}
