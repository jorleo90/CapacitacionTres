package com.qvision.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
	WebElement txtUsername;
	WebElement txtPassword;
	WebElement btnLogin;
	WebElement lblMessage;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void loginApp(String username, String password) {
		txtUsername = driver.findElement(By.name("user"));
		txtUsername.sendKeys(username);
		txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys(password);
		btnLogin = driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));
		btnLogin.click();
	}

	public boolean validateLogin() {
		boolean isValidateLogin = true;
		try {			
			lblMessage = driver.findElement(By.id("errorMessage"));
			if(lblMessage.isDisplayed()){
				isValidateLogin = false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isValidateLogin;
	}

}
