package com.mindtree.appUIstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CorporateGifts {
	public WebDriver driver;
	public static By corporate = By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[1]/a");
	public static By fullName = By.id("contactFormName");
	public static By email = By.id("contactFormEmail");
	public static By phone = By.id("contactFormPhone");
	public static By desc = By.id("contactFormMessage");
	public static By submit = By.xpath("//*[@id='contactFormWrapper']/div/input[4]");


}
