package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.PincodeLocator;

public class pincode {
 WebDriver driver = null;
     
     public pincode(WebDriver driver)
     {
  	   this.driver = driver;
     }
     
     public WebElement getopen()
     {
  	   return driver.findElement(PincodeLocator.open);
     }
}
