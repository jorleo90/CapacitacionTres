package com.qvision.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Contact {

	WebDriver driver;
	WebElement scroll;
	WebElement txtNombre;
	WebElement txtCorreo;
	WebElement txtNumero;
	WebElement txtNombreEmpresa;
	WebElement txtCiudad;
	WebElement txtAsunto;
	WebElement txtMensaje;
	
	public Contact(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void scrollDown() {		
		
	JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;
	ScrollDown.executeScript("window.scrollBy(0, 1000)");	
		
	}
	
	public void writeElements(String nombre, String correo, int numero, String nombreEmpresa, String ciudad, String asunto, String mensaje ) {
		
		txtNombre = driver.findElement(By.name("your-name"));
		txtNombre.sendKeys(nombre);
		
		txtCorreo = driver.findElement(By.name("your-email"));
		txtCorreo.sendKeys(correo);
		
		txtNumero = driver.findElement(By.name("your-number"));
		txtNumero.sendKeys(numero + "");
		
		txtNombreEmpresa = driver.findElement(By.name("nombreempresa"));
		txtNombreEmpresa.sendKeys(nombreEmpresa);
		
		txtCiudad = driver.findElement(By.name("ciudad"));
		txtCiudad.sendKeys(ciudad);
		
		txtAsunto = driver.findElement(By.name("your-subject"));
		txtAsunto.sendKeys(asunto);
		
		txtMensaje = driver.findElement(By.name("your-message"));
		txtMensaje.sendKeys(mensaje);
	}	
	
}
