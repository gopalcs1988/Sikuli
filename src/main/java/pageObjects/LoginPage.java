package pageObjects;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;

import resource.base;


public class LoginPage extends base{
	
	public void login() throws FindFailed {
		driver.get(prop.getProperty("url"));
		String login = "bssuqawwev3/JEmail";
		screen.wait("loginPage.png", 20);
		screen.type(login);
		screen.click("next.png");
		screen.wait("signIn.png", 10);
		screen.type("Genesys");
		screen.click("signIn.png");
		screen.wait("MyChannels.png",10);
		screen.waitVanish("signIn.png", 10);
		driver.close();
	}
}
