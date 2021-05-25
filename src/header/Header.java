package header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import methodescommunes.MethodesCommunes;

public class Header {

	public void SignIn() {
		// TODO Auto-generated method stub

		MethodesCommunes commune = new MethodesCommunes();

		commune.SetDriver();
		commune.OpenWebPage("https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/");
		WebElement signin = commune.LocateByLinkText("Sign In / Register");
		commune.MyClick(signin);
		commune.GoBack();

	}

}
