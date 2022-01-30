package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public  void doLinkClick(By locator, String value) {
		List<WebElement> langLinks = getElements(locator);
		for (int i = 0; i < langLinks.size(); i++) {
			String Googlelang = langLinks.get(i).getText();
			System.out.println(Googlelang);
			if (Googlelang.equals(value)) {
				langLinks.get(i).click();
				break;
			}
		}
	}
	
	public List<String> getDropDownOptionsList(By locator) {

		Select select_con = new Select(getElement(locator));
		List<String> OptionsTextList = new ArrayList<String>();
		List<WebElement> OptionsList = select_con.getOptions();
		System.out.println(OptionsList.size());

		for (WebElement e : OptionsList) {
			OptionsTextList.add(e.getText());
		}

		return OptionsTextList;
	}

}
