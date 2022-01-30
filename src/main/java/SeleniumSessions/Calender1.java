package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(3000);
		By calendar=By.id("departureCalendar");
		By month=By.xpath("//div[@class='DayPicker-Caption']");
		By selectMonth=By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']");
		getElement(calendar).click();
		selectMonth(month,selectMonth,"June");
		selectDate("25", "div");
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void selectMonth(By locator1,By locator2,String month) {
		String monthName=getElement(locator1).getText();
		while(!(monthName.contains(month)) ){
			getElement(locator2).click();
			monthName=getElement(locator1).getText();
		}
	}
	public static void selectDate(String day, String tagName) {
		boolean flag=false;
		By calendarDate=By.xpath("//"+tagName+"[text()='"+day+"']");
		List<WebElement> dateList=driver.findElements(calendarDate);
		
		for(WebElement e:dateList) {
			if(e.getText().equals(day)) {
				System.out.println("correct day..."+day);
				e.click();
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("wrong date......"+day);
		}
	}
}

