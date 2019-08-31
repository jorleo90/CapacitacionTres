package com.capacitacion.wait;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	WebDriver driver;

	@Before
	public void cargarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
	}

	@Test
	public void test() {
		// Espera Explicita
		WebDriverWait waitDriver = new WebDriverWait(driver, 20);
		// Simular Evento de Espera
		WebElement txtUsuario = waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		txtUsuario.sendKeys("usuario");
		// Elemento que no espera
		WebElement lnkRegistro = driver.findElement(By.xpath("//a[contains(text(), 'Register')]"));
		lnkRegistro.click();
	}

	@After
	public void cerrarDriver() {
		driver.close();
		driver.quit();
	}

}
