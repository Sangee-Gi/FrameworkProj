package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.AddToCartLocator;

public class AddToCart {
 WebDriver driver = null;
     
     public AddToCart(WebDriver driver)
     {
  	   this.driver = driver;
     }
     
     public WebElement getAddToCart()
     {
  	   return driver.findElement(AddToCartLocator.PersonalizedName);
     }
    /* public WebElement getcart()
     {
  	   return driver.findElement(AddToCartLocator.addtocart);
     }
	
     public WebElement getTitleAfterAdding()
     {
  	   return driver.findElement(AddToCartLocator.addtocart);
     }*/
}
