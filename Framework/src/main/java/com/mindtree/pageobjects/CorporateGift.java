package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.CorporateGifts;

public class CorporateGift {
		WebDriver driver = null;
		
	public CorporateGift(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getCorporate() {

		return driver.findElement(CorporateGifts.corporate);

	}

	public WebElement getFullName() {

		return driver.findElement(CorporateGifts.fullName);

	}

	public WebElement getEmail() {

		return driver.findElement(CorporateGifts.email);

	}

	public WebElement getPhone() {

		return driver.findElement(CorporateGifts.phone);

	}

	public WebElement getDesc() {

		return driver.findElement(CorporateGifts.desc);

	}

	public WebElement getSubmit() {

		return driver.findElement(CorporateGifts.submit);

	}
}
