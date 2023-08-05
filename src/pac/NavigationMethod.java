package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dev\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.com/");

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		// for refresh
		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com/");
		String str = driver.getCurrentUrl();
		System.out.println(str);
		driver.quit();

	}

}
