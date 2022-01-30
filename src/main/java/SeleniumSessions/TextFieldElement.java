package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldElement {

	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By loginLink = By.linkText("Login");
		By regFrom = By.xpath("//input[@class='form-control']");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		List<WebElement> fromList =eleUtil.getElements(regFrom);
		
		if (eleUtil.doIsDisplayed(loginLink)) {
			System.out.println("Login is present");
		}
		
		if(fromList.size() == 6) {
			System.out.println("Yes , all field are present ......");
		}

		for(WebElement e : fromList) {
			e.sendKeys("tetsing");
		}
		
	}

}
