package TestPom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.pages.Contact;
import com.qvision.pages.Home;

public class ContactTestJU {

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
		Contact scrollDown = new Contact (driver);
		
		homeNavigation.HomeNavigation();
		scrollDown.scrollDown();
		scrollDown.writeElements("Axel", "abernal@qvision.com.co", 344657020,"QVision", "Bogotá", "Solicitud de servicio", "La presente es para poder aduirir un servicio de automatizacion" );
		
	}
	@After
	public void close() {
		driver.quit();
	}

}
