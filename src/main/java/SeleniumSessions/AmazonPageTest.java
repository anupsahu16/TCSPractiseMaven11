package SeleniumSessions;

public class AmazonPageTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(browserName);
		br.launchUrl("https://www.amazon.com");
		String title = br.getTitle();
		if(title.contains("Smile")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		String currentUrl = br.getCurrentUrl();
		System.out.println(currentUrl);

		br.quitBrowser();
	}

}
