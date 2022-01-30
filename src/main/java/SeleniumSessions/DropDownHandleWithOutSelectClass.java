package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithOutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By CountryOptions = By.xpath("//select[@id='Form_submitForm_Country']/Option");

		List<WebElement> CountryList = driver.findElements(CountryOptions);
		for (WebElement e : CountryList) {
			if (e.getText().equals("India")) {
				e.click();
				break;
			}
		}

	}

}
