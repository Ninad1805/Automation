package Java_Selenium.Product;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	@Test
	public void demoTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.k12insight.com/static/k12insight_login.html");
		driver.close();
	}
}
