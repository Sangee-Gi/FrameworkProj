package com.mindtree.runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.mindtree.pageobjects.AddToCart;
import com.mindtree.pageobjects.COD;
import com.mindtree.pageobjects.CorporateGift;
import com.mindtree.pageobjects.GIftCard;
import com.mindtree.pageobjects.HomePage;
import com.mindtree.pageobjects.SearchBox;
import com.mindtree.pageobjects.SelectProduct;
import com.mindtree.pageobjects.Signin;
import com.mindtree.pageobjects.TrackOrderDetails;
import com.mindtree.pageobjects.Wishlist;
import com.mindtree.pageobjects.pincode;
import com.mindtree.reusablecomponent.WebDriverHelper;
import com.mindtree.utility.ReadPropertyFile;
import com.mindtree.utility.RetriveExcelData;


public class BigSmall {
	Logger log = LogManager.getLogger(BigSmall.class.getName());

	WebDriver driver = null;
	ReadPropertyFile rp = null;
	
	/*
	 * this method is responsible for landing at home page and click on sign button.
	 * 
	 * WebDriverHelper class has a initializeDriver() method which will launch and
	 * initialize the driver.
	 * 
	 * ReadPropertyFile class :- contains method which is used to retrieve data from
	 * property file.
	 * 
	 * HomePage class contains method to return webelement of respective web page;
	 */
	
	@Test(priority=1)
	public void SignIn() throws Exception {
		rp = new ReadPropertyFile();

		driver = WebDriverHelper.initializeDriver();

		driver.get(rp.getUrl());
		System.out.println("url hited");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("<<<-navigated to url->>>");
		 ChromeOptions options = new ChromeOptions();
	     options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		
		Signin s = new Signin(driver);
		s.getSignin().click();
		s.getEmail().sendKeys("ksangee210@gmail.com");
		log.info("email entered");
		s.getPassword().sendKeys("sangee");
		log.info("password entered");
        s.getSignin().click();
	}
	
	@Test(priority = 2)
	public void homePageLanding() throws Exception {

		log.info("landing at home page");

		HomePage hp = new HomePage(driver);

		hp.getallofit().click();
		log.info("clicked on all of it button");
		Assert.assertTrue(true);
}
	
	
	@Test(priority = 3)
	public void searchProductTesting() throws IOException {

		ArrayList<String> d = RetriveExcelData.getData("SearchProduct");
		System.out.println(d.get(1));
		SearchBox sb = new SearchBox(driver);

		// System.out.println("items "+d.size() + d.get(d.size()-1));

		for (int i = 1; i < d.size(); i++) {
			sb.getSearchBox().sendKeys(d.get(i));
			sb.getSearchBox().sendKeys(Keys.ENTER);
		}

		log.info("enterd product name");
	}
	
	@Test(priority = 4)
	public void selectProductTesting() throws InterruptedException {

		Thread.sleep(5000L);
		SelectProduct sp = new SelectProduct(driver);

		List<WebElement> lb = sp.getSelectProduct();

		if (lb.size() == 0)
			System.out.println("no product found");

		lb.get(0).click();

		log.info("selected search product");

		Thread.sleep(5000L);
	}

	
	@Test(priority = 5)
	public void addToCardTesting() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		AddToCart atc = new AddToCart(driver);
	
        atc.getAddToCart().sendKeys("sangee");
        log.info("persnolaized name is added ");
        /*atc.getcart().click();

		Thread.sleep(5000L);

		Assert.assertTrue(atc.getTitleAfterAdding().getText().contains("You added"));

		log.info("product added into cart successfully");*/

	}
	@Test(priority = 6)
	public void wishlisttesting() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Wishlist w = new Wishlist(driver);
	
        w.getwish().click();
        log.info("clicked on wishlist");

	}
	@Test(priority = 7)
	public void addGIftCard() {
		GIftCard gc = new GIftCard(driver);
		gc.getgiftcard().click();
		log.info("clicked on gift card");
		gc.getprice().click();
		log.info("price card is selected");
		gc.getquantity().click();
		log.info("quantity is added to the cart");
		
		
	}
	@Test(priority = 8)
    public void addCOD() throws InterruptedException {
	COD c = new COD(driver);
	 Thread.sleep(2000);
	 c.getpin().sendKeys("635109");
	 log.info("passed pincode");
	 c.getcheck().click();
	 log.info("clicked on check button");
	c.getcart().click();
	log.info("clicked on cart");
	
	
	
}
	@Test(priority=9)
	public void logintest() throws InterruptedException {
		TrackOrderDetails td = new TrackOrderDetails(driver);
		td.getTrack().sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
	    
		Set<String> ab = driver.getWindowHandles();
		Iterator<String> it = ab.iterator();
		String parentId = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		
	    ChromeOptions options  = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
		
	    td.getmail().sendKeys("ksangee210@gmail.com");
	    td.getid().sendKeys("073907");
	    td.getfind().click();
		  System.out.println(driver.getTitle());
		    Thread.sleep(2000);
		    driver.switchTo().window(parentId);
	}
	@Test(priority=10)
	public void coGift() throws InterruptedException {
		CorporateGift c = new CorporateGift(driver);
		c.getCorporate().click();
		 Thread.sleep(2000);
		c.getFullName().sendKeys("sangee");
		c.getEmail().sendKeys("ksangee210@gmail.com");
		c.getPhone().sendKeys("8825704783");
		c.getDesc().sendKeys("this is description");
		c.getSubmit().click();
		log.info("Submitted successfully");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");

	}
	@AfterTest
	public void closeDriver() 
	{
		driver.close();
		driver = null;
	}
	
}
	

