package Sample.Sikuli;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resource.base;

public class AppTest extends base{
	
	LoginPage lp = new LoginPage();

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}
	
	@Test
	public void loginPageTest() throws FindFailed, InterruptedException {
			lp.login();		
	}
	
	@AfterTest
	public void quitDriver()
	{
		driver.quit();
	}

}