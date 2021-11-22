package com.mindtree.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.appUIstore.TrackOrderLocator;

public class TrackOrderDetails
{
	WebDriver driver = null;
	
	public TrackOrderDetails(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getTrack()
	{
		return driver.findElement(TrackOrderLocator.trackorder);
	}
	public WebElement getmail()
	{
		return driver.findElement(TrackOrderLocator.email);
	}
	public WebElement getid()
	{
		return driver.findElement(TrackOrderLocator.orderId);
	}
	public WebElement getfind()
	{
		return driver.findElement(TrackOrderLocator.find);
	}

}
