package com.mindtree.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.SigninLocator;

public class Signin {
	 WebDriver driver = null;
	public Signin(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getSignin() {
		return driver.findElement(SigninLocator.signin);
	}
	
	public WebElement getEmail() {
		return driver.findElement(SigninLocator.email);
	}

	public WebElement getPassword() {
		return driver.findElement(SigninLocator.password);
	}
	
	public WebElement getSigninButton() {
		return driver.findElement(SigninLocator.signButton);
	}
	
}


