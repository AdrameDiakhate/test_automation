package firsst_test_ng_class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {

	public static String chrome_driver = "webdriver.chrome.driver";

	public static String path_chrome_driver = "C:\\Users\\DESKLAP PRO\\Downloads\\chromedriver_win32\\chromedriver.exe";

	public static String url = "https://www.google.com/";

	WebDriver driver;

	@Test
	public void f() {

		System.setProperty(chrome_driver, path_chrome_driver);

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get(url);
		driver.findElement(By.xpath("//input[@title='Rechercher']")).sendKeys("ordinateur portable", Keys.ENTER);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting the test case");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("Finished test case");
		driver.quit();
	}

}
