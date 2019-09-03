package com.qvision.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	WebDriver driver;
	WebElement btnContact;
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public void HomeNavigation() {
		
		btnContact = driver.findElement(By.xpath("//*[@id=\"menu-item-7513\"]/a/span"));
		btnContact.click();
		
	}
	
}
