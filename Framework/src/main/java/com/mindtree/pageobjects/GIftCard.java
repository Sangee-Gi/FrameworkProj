package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.GiftCardLocator;

public class GIftCard {
	
	WebDriver driver = null;
    
    public GIftCard(WebDriver driver)
    {
 	   this.driver = driver;
    }
    
    public WebElement getgiftcard()
    {
 	   return driver.findElement(GiftCardLocator.giftcard);
    }
    public WebElement getprice()
    {
    	return driver.findElement(GiftCardLocator.price);
    }
    public WebElement getquantity()
    {
    	return driver.findElement(GiftCardLocator.quantity);
    }
}
