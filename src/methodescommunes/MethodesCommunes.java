package methodescommunes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodesCommunes {

	private static WebDriver driver;

	// Pour créer une nouvelle instance de ChromeDriver
	public void SetDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DESKLAP PRO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	// Ouvrir une nouvelle page web et l'agrandir

	public static void OpenWebPage(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	// Pour cliquer sur un élement donné
	public void MyClick(WebElement cliquable) {
		cliquable.click();
	}

	// Pour trouver un élément par son xpath
	public WebElement LocateElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	// Pour trouver un élément par son id
	public WebElement LocateById(String id) {
		return driver.findElement(By.id(id));
	}

	// Pour trouver un élément par son link text
	public WebElement LocateByLinkText(String linktext) {
		return driver.findElement(By.linkText(linktext));
	}

	// Pour trouver un élément par son name
	public WebElement LocateByName(String name) {
		return driver.findElement(By.name(name));
	}

	// Pour trouver un élément par son className
	public WebElement LocateByClassName(String classname) {
		return driver.findElement(By.className(classname));
	}

	// Pour trouver un élément par son partial link text
	public WebElement LocateByPartialLinkText(String partial_link) {
		return driver.findElement(By.partialLinkText(partial_link));
	}

	// Pour trouver un élément par son tag name
	public WebElement LocateByTagName(String tag) {
		return driver.findElement(By.tagName(tag));
	}

	// Pour trouver un élément par son css selector
	public WebElement LocateByCssSelector(String selector) {
		return driver.findElement(By.cssSelector(selector));
	}

	// Pour retourner en arrière
	public void GoBack() {
		driver.navigate().back();
	}

	// Pour aller en avant
	public void GoForward() {
		driver.navigate().forward();
	}
	public void Sleep(Integer millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}