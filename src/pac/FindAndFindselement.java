package pac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAndFindselement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dev\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

//		WebElement ele = driver.findElement(By.name("firstname")); // find element method gives us the webelement
//		ele.sendKeys("ashish");
//		System.out.println(ele.getText());
//		String str = ele.getAttribute("value");
//		
//		System.out.println(str);

		// FINDS ELEMENT

		List<WebElement> eles = driver.findElements(By.xpath("//div[@id='pageFooter']//a"));

		int len = eles.size();

		for (WebElement webElement : eles) {

			String str = webElement.getText();

			String str1 = webElement.getAttribute("href");

			System.out.println("text = " + str + " "+  "links = " + str1);
		}

		driver.close();
	}

}
