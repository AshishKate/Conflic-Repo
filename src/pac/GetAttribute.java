package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dev\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login");

		WebElement box = driver.findElement(By.id("Email"));
		box.clear();
		box.sendKeys("Ashish");
		System.out.println(box.getAttribute("value"));

		WebElement pass = driver.findElement(By.name("Password"));
		pass.clear();
		pass.sendKeys("xyz");
		System.out.println(pass.getAttribute("value"));

		driver.findElement(By.xpath("//button"));

		driver.close();

	}

}
