package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.WishlistLocator;

public class Wishlist {
 WebDriver driver = null;
     
     public Wishlist(WebDriver driver)
     {
  	   this.driver = driver;
     }
     
     public WebElement getwish()
     {
  	   return driver.findElement(WishlistLocator.wishlist);
     }
}

