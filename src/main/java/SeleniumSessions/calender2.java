package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		By monthPath = By.xpath("//span[@class='ui-datepicker-month']");

		for (int i = 1; i <= 12; i++) {
			WebElement mon = driver.findElement(monthPath);
			String month = mon.getText();
			System.out.println(month);

			if (month.equals("April")) {
				System.out.println("Month is March");
				selectDate("21");
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();

			}
		}

	}

	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}

}

