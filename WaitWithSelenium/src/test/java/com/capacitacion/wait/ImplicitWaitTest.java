package com.capacitacion.wait;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTest {

	WebDriver driver;

	@Before
	public void cargarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		// Espera Implicita
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sahitest.com/demo/training/login.htm");
	}

	@Test
	public void test() {
		// Simular Evento de Espera
		WebElement txtUsuario = driver.findElement(By.name("username"));
		txtUsuario.sendKeys("usuario");
		// Elemento que tambien esperara
		WebElement lnkRegistro = driver.findElement(By.xpath("//a[contains(text(), 'Register')]"));
		lnkRegistro.click();
	}

	@After
	public void cerrarDriver() {
		driver.close();
		driver.quit();
	}

}
