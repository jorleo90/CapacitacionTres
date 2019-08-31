package com.qvision.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.pages.Login;

public class LoginTest {

	WebDriver driver;

	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
	}

	@Test
	public void test() {
		Login pageLogin = new Login(driver);
		pageLogin.loginApp("test", "secret");
		Assert.assertTrue("No inicio sesión!!", pageLogin.validateLogin());
	}

	@After
	public void close() {
		driver.close();
	}

}
