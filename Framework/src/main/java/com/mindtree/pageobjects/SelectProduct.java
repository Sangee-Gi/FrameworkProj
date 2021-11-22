package com.mindtree.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.SelectProductLocator;

public class SelectProduct {
	 WebDriver driver = null;
     
     public SelectProduct(WebDriver driver)
     {
  	   this.driver = driver;
     }
     
     public List<WebElement> getSelectProduct()
     {
       return driver.findElements(SelectProductLocator.selectproduct);
     }

}
