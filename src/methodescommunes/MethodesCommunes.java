package methodescommunes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class MethodesCommunes {

	// Initialiation des attributs

	public static String chrome_driver = "webdriver.chrome.driver";

	public static String path_chrome_driver = "C:\\Users\\DESKLAP PRO\\Downloads\\chromedriver_win32\\chromedriver.exe";

	public static String url = "https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/";
	

	// Retourne un chrome driver

	public WebDriver SetDriver() {

		System.setProperty(chrome_driver, path_chrome_driver);

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get(url);

		return driver;
	}

	// On passe le driver et le locateur à la méthode et elle retourne le webElement
	// correspondant

	public WebElement locateElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	// Clique sur l'élément passé en paramètre

	public void Click(WebElement webelement) {
		webelement.click();
	}

	// Retoune un si le webElement passé en paramètre s'affiche bien

	public Boolean isElementDisplayed(WebElement webelement) {
		return webelement.isDisplayed();
	}
}