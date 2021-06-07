package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import body.Body;
import footer.Footer;
import header.Header;
import methodescommunes.MethodesCommunes;

public class Main {

	static Header header;
	static Body body;
	static Footer footer;
	static MethodesCommunes commune = new MethodesCommunes();
	static WebDriver driver;

	public static void GetInstanceDriver() {
		driver = commune.SetDriver();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scenario1();
		scenario2();

	}

	public static void InstancesParties() {

		Header header = new Header(driver);

		// Body body=new Body(driver);

		// body.CroixRouge();

		// Footer footer = new Footer(driver);

		// footer.GoToTwitterPage();

	}

	public static void scenario1() {
		GetInstanceDriver();
		InstancesParties();
		header.SignIn();
		header.FindStore();
		header.SearchProducts();
		header.Timbres();
		

	}
	// 10 scénario qui ont au minimum 6 étapes, il faudra relancer le navigateur

	public static void scenario2() {
		/*GetInstanceDriver();
		InstancesParties();
		header.SearchProducts();
		header.Timbres();
		*/
	}
}