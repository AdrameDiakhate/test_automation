package header;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import methodescommunes.MethodesCommunes;

public class Header {

	//Les attributs
	
	MethodesCommunes commune = new MethodesCommunes();
	By signinLinkText = By.linkText("Sign In / Register");
	By searchXpath = By.xpath("//input[@aria-label='search']");
	By timbresXpath = By.xpath("//h5[@aria-label='Timbres']");
	By findstoreXpath = By.xpath("//a[@href='/store-finder']");

	WebDriver driver;

	//Le constructeur
	
	public Header(WebDriver driver) {
		this.driver = driver;
	}

	//Les méthodes
	
	public void SignIn() {
		// TODO Auto-generated method stub

		driver.get(commune.url);
		driver.findElement(signinLinkText).click();
		driver.navigate().back();
	}

	public void SearchProducts() {
		driver.findElement(searchXpath).sendKeys("camera", Keys.ENTER);
		driver.navigate().back();
	}

	public void Timbres() {
		driver.get(commune.url);
		WebElement timbres=driver.findElement(timbresXpath);
		Actions timbres_action = new Actions(driver);
		timbres_action.moveToElement(timbres);
		driver.navigate().back();
	}

	public void FindStore() {
		
		driver.get(commune.url);
		driver.findElement(findstoreXpath).click();
		
		driver.navigate().back();
	}
}
