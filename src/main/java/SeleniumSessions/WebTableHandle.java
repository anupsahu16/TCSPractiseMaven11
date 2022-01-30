package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/women-s-ashes-2021-22-1263566/australia-women-vs-england-women-only-test-1263571/full-scorecard");
		String xpathVal= "//a[text()='Ellyse Perry']/parent::td/following-sibling::td[@class='text-left']";
		
		String wicketTakerName= driver.findElement(By.xpath(xpathVal)).getText();
		System.out.println(wicketTakerName);
		
		List<WebElement> ScoreList =driver.findElements(By.xpath("//a[text()='Ellyse Perry']/parent::td/following-sibling::td"));
		
		for(int i = 1 ; i <ScoreList.size();i++ ) {
			System.out.println(ScoreList.get(i).getText());
		}
	}

}
