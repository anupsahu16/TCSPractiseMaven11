package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//akank//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		String title = driver.getTitle();

		if (title.equals("Google")) {
			System.out.println("Correct Tittle");
		} else {
			System.out.println("InCorrect Title");
		}

		driver.close();
	}

}
