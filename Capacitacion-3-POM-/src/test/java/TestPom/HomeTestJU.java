package TestPom;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.pages.Home;

public class HomeTestJU {

	WebDriver driver;
	@Before
	public void initDriver() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("http://www.qvision.com.co/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		
		Home homeNavigation = new Home(driver);
		homeNavigation.HomeNavigation();
		
	}

}
