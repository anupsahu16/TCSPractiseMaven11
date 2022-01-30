package SeleniumSessions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProductTechnicalDetails {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.com/Factory-Unlocked-Compatible-Verizon-International/dp/B0977HR8JT/ref=sr_1_3?crid=2VFKXN72QNAUN&keywords=redmi+phone+5g&qid=1643290814&sprefix=red+mi+p%2Caps%2C529&sr=8-3");

		int rowCount = driver.findElements(By.xpath("//table[@id='productDetails_detailBullets_sections1']//tr"))
				.size();
		System.out.println(rowCount);
		String headerXpath = "//table[@id='productDetails_detailBullets_sections1']//tr/th";
		String tableDataXpath = "//table[@id='productDetails_detailBullets_sections1']//tr/th/following-sibling::td";

		List<WebElement> headerList = driver.findElements(By.xpath(headerXpath));
		List<WebElement> tableDataList = driver.findElements(By.xpath(tableDataXpath));

		if (headerList.size() == tableDataList.size()) {
			for (WebElement e : headerList) {
				System.out.println(e.getText());
			}
			for (WebElement e : tableDataList) {
				System.out.println(e.getText());

			}

		}

		else {
			System.out.println("data is mismatched...");
		}

		Map<String, String> productMap = new HashMap<String, String>();

		if (headerList.size() == tableDataList.size()) {
			for (int i = 0; i < headerList.size(); i++) {
				productMap.put(headerList.get(i).getText(), tableDataList.get(i).getText());
			}
		}

		for (Map.Entry<String, String> entry : productMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
