package footer;

import org.openqa.selenium.WebElement;

import methodescommunes.MethodesCommunes;

public class Footer {

	public void GoToTwitterPage() {
		MethodesCommunes commune = new MethodesCommunes();
		commune.SetDriver();
		commune.OpenWebPage("https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/");

		commune.Sleep(3000);
		WebElement linkTwitter = commune.LocateByLinkText("Twitter");
		commune.Sleep(3000);
		commune.MyClick(linkTwitter);
	}

}
