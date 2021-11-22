package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.SearchBoxPageLocator;

	public class SearchBox {
		
	       WebDriver driver = null;
	       
	       public SearchBox(WebDriver driver)
	       {
	    	   this.driver = driver;
	       }
	       
	       public WebElement getSearchBox()
	       {
	    	   return driver.findElement(SearchBoxPageLocator.searchbox);
	       }
	      
}
