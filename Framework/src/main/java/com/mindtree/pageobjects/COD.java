package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.CODLocator;

public class COD {
	
WebDriver driver = null;
    
    public COD(WebDriver driver)
    {
 	   this.driver = driver;
    }
    
    public WebElement getpin()
    {
 	   return driver.findElement(CODLocator.pin);
    }
    public WebElement getcheck()
    {
 	   return driver.findElement(CODLocator.check);
    }
    public WebElement getcart()
    {
 	   return driver.findElement(CODLocator.cart);
    }
    public WebElement getadd()
    {
 	   return driver.findElement(CODLocator.add);
    }
}
