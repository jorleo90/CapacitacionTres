package com.qvision.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.pages.Books;
import com.qvision.pages.Login;

public class BooksTest {
	
	WebDriver driver;

	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
	}

	@Test
	public void test() {
		Login login = new Login(driver);
		Books book = new Books(driver);
		
		login.loginApp("test", "secret");
		book.agregarLibros(1, 1, 1);
		assertTrue(book.validarTotal(850));
	}
	
	@After
	public void close() {
		driver.close();
	}

}
