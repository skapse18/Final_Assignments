package com.cg.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class AmazonSteps
{
	WebDriver driver;
	Amazon amazon;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shkapse\\Downloads\\BDDFolder\\selenium client\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		amazon=PageFactory.initElements(driver, Amazon.class);
	}
	
	@Given("^I add products to the cart$")
	public void addCart() throws InterruptedException
	{
		amazon.searchBox.click();
		amazon.searchBox.sendKeys("Books");
		amazon.submit.click();
		amazon.link.click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		amazon.addToCart.click();
		
		amazon.mainPage.click();
		amazon.searchBox.sendKeys("tops");
		amazon.submit.click();
		amazon.link1.click();
		amazon.addTocart1.click();
		
		amazon.mainPage.click();
		amazon.searchBox.sendKeys("shoes");
		amazon.submit.click();
		amazon.link2.click();
		amazon.addTocart2.click();
		
		amazon.mainPage.click();
		amazon.searchBox.sendKeys("bags");
		amazon.submit.click();
		amazon.link3.click();
		amazon.addTocart3.click();
		
		amazon.mainPage.click();
		amazon.searchBox.sendKeys("necklace");
		amazon.submit.click();
		amazon.link4.click();
		amazon.addTocart4.click();
		
		amazon.mainPage.click();
		
	}
	
}
