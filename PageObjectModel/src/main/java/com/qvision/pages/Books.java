package com.qvision.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Books {

	WebDriver driver;
	WebElement txtJava;
	WebElement txtRuby;
	WebElement txtPython;
	WebElement txtTotal;
	WebElement btnAgregar;
	WebElement btnLimpiar;
	WebElement btnSalir;
	
	public Books(WebDriver driver){
		this.driver = driver;
	}
	
	public void agregarLibros(int java, int ruby, int python){
		txtJava = driver.findElement(By.xpath("//tr[2]/td[4]/input"));
		txtJava.clear();
		txtJava.sendKeys(java + "");
		
		txtRuby = driver.findElement(By.xpath("//tr[3]/td[4]/input"));
		txtRuby.clear();
		txtRuby.sendKeys(ruby + "");
		
		txtPython = driver.findElement(By.xpath("//tr[4]/td[4]/input"));
		txtPython.clear();
		txtPython.sendKeys(python + "");
		
		btnAgregar = driver.findElement(By.xpath("//div[@id='available']/input[1]"));
		btnAgregar.click();
	}
	
	public boolean validarTotal(int valorEsperado){
		txtTotal = driver.findElement(By.xpath("//input[@id='total']"));
		int total = Integer.parseInt(txtTotal.getAttribute("value"));
		boolean iguales = false;
		if(valorEsperado == total){
			iguales = true;
		}
		return iguales;
	}
	
}
