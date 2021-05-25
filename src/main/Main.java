package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import body.Body;
import footer.Footer;
import header.Header;
import methodescommunes.MethodesCommunes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Header header=new Header();
		// header.SignIn();

		// Body body=new Body();
		// body.CroixRouge();

		Footer footer = new Footer();

		footer.GoToTwitterPage();

	}

}