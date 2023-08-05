package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dev\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://formstone.it/components/dropdown/demo/");

		WebElement drp = driver.findElement(By.id("demo_basic-dropdown"));
		
		
		Select sel= new Select(drp);
		
		sel.selectByIndex(1);
		driver.quit();
		
		

	}

}
