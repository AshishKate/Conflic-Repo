package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dev\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		String str = driver.getTitle();

		System.out.println("The Title oF The Page is " + str);

		System.out.println("The url of teh page is " + driver.getCurrentUrl());

		System.out.println("The page source is " + driver.getPageSource());

		driver.close();

		
	}

}
