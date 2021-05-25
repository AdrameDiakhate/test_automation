package body;

import org.openqa.selenium.WebElement;

import methodescommunes.MethodesCommunes;

public class Body {
	public void CroixRouge() {
		MethodesCommunes commune = new MethodesCommunes();
		commune.SetDriver();
		commune.OpenWebPage("https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/");
		WebElement croix_rouge = commune.LocateElementByXpath("//h4[contains(text(),'La Croix Rouge Française')]");
		commune.MyClick(croix_rouge);
		commune.GoBack();
	}
}