package la_poste_test_ng;

import org.testng.annotations.Test;

import body.Body;
import footer.Footer;
import header.Header;
import methodescommunes.MethodesCommunes;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class LaposteTestng {

	Header header;
	Body body;
	Footer footer;
	MethodesCommunes commune = new MethodesCommunes();
	WebDriver driver;

	@Test
	public void PosteTestNg() {
		header.SignIn();
		header.FindStore();
		header.SearchProducts();
		header.Timbres();
	}

	@BeforeMethod
	public void beforeMethod() {
		this.driver = commune.SetDriver();
		header=new Header(driver);
		//body=new Body();
		//footer=new Footer();
	}

	@AfterMethod
	public void afterMethod() {
	}

}

