package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.HomePageLocator;

public class HomePage {
	 WebDriver driver = null;
     
     public HomePage(WebDriver driver)
     {
  	   this.driver = driver;
     }
     
     public WebElement getallofit()
     {
  	   return driver.findElement(HomePageLocator.allofit);
     }
}
