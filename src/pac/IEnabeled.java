package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IEnabeled {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dev\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		WebElement box = driver.findElement(By.name("q"));

		if (box.isEnabled()) {
			System.out.println("Box is enabeled");
		}

		if (box.isDisplayed()) {
			System.out.println("box is displayed");
		}

		
//		box.sendKeys("hello");
		
		if (box.isSelected()) {
			System.out.println("box is selected");
		}

		else {
			System.out.println("not selected");
		}
		
		
		driver.quit();
		

	}

}
