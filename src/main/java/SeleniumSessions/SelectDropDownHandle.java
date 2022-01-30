package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_submitForm_Country");
		
//		WebElement con_ele= driver.findElement(country);
//		
//		Select select = new Select(con_ele);
//		
//		select.selectByIndex(3);
//		select.selectByVisibleText("Angola");
//		select.selectByValue("Bahrain");
		
		doSelectByVisibleText(country, "Angola");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator , String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
}
