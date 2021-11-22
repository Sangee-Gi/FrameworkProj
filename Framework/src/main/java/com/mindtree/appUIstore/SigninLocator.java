package com.mindtree.appUIstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninLocator {
	public WebDriver driver;
	public static By signin = By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]/span");
	public static By email = By.xpath("//*[@id='CustomerEmail']");
	public static By password = By.xpath("//*[@id='CustomerPassword']");
	public static By signButton = By.xpath("//*[@id='customer_login']/p[1]/input");


}
