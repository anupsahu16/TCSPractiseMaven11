package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("Parent window id is " + parentWindowID);

		String childWindowID = it.next();
		System.out.println("Child window id is " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("Child window id is : " +driver.getTitle());
		driver.close(); //close the child window
		
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		 handles = driver.getWindowHandles();
		 it = handles.iterator();
		String parentWindowID1 = it.next();
		System.out.println("Parent window id is " + parentWindowID1);

		String childWindowID1 = it.next();
		System.out.println("Child window id is " + childWindowID1);
		
		driver.switchTo().window(childWindowID1);
		System.out.println("Child window id is : " +driver.getTitle());
		driver.close(); //close the child window
		
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		 handles = driver.getWindowHandles();
		 it = handles.iterator();
		String parentWindowID2 = it.next();
		System.out.println("Parent window id is " + parentWindowID2);

		String childWindowID2 = it.next();
		System.out.println("Child window id is " + childWindowID2);
		
		driver.switchTo().window(childWindowID2);
		System.out.println("Child window id is : " +driver.getTitle());
		driver.close(); //close the child window
		
		driver.switchTo().window(parentWindowID2);
		System.out.println("Parent window id is : " +driver.getTitle());
		driver.quit();
		
		
	}

}
