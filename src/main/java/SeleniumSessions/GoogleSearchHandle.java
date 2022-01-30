package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		Thread.sleep(10000);
		
		List<WebElement> SuggestList=
				driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']//span"));
		System.out.println(SuggestList.size());
		for(WebElement e : SuggestList ) {
			String text = e.getText();
			System.out.println(text);
			if(e.getText().equals("naveen automation labs api testing")) {
				e.click();
				break;
			}
		}

	}

}
