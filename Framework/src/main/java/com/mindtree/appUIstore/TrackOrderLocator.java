package com.mindtree.appUIstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrackOrderLocator {
	public WebDriver driver;
	
	public static By trackorder = By.xpath("//*[@id=\'shopify-section-footer\']/footer[1]/div[1]/div[1]/div[3]/ul/li[4]/a");
	public static By email=By.xpath("//*[@id='ola_email']");
	public static By orderId=By.xpath("//*[@id='ola_orderNumber']");
	public static By find = By.xpath("//*[@id='ola_submitButton']");

}
