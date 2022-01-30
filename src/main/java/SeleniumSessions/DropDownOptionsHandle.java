package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptionsHandle {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_submitForm_Country");
		List<String> countryList = getDropDownOptionsList(country);
		System.out.println(countryList.contains("India"));
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> getDropDownOptionsList(By locator) {
		
		Select select_con = new Select(getElement(locator));
		List<String> OptionsTextList = new ArrayList<String>();
		List<WebElement> OptionsList = select_con.getOptions();
		System.out.println(OptionsList.size());
		
		for(WebElement e :OptionsList ) {
			OptionsTextList.add(e.getText());
		}

		return OptionsTextList;
	}
	
	

}
