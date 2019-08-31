package com.automation.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	WebDriver driver;

	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
	}
	
	@Test
	public void test() {
		WebElement txtUsuario = driver.findElement(By.name("user"));
		txtUsuario.sendKeys("test");
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("secret");
		WebElement btnIniciar = driver.findElement(By.xpath("//input[@type='submit']"));
		btnIniciar.click();
		WebElement lblTitulo = driver.findElement(By.xpath("//*[@id='available']/h2"));
		String strLbl = lblTitulo.getText();
		assertEquals("Fallo porque si!", strLbl, "All available book");
	}
	
	@After
	public void cerrarDriver() {
		driver.quit();
	}

}
