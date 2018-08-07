package com.cg.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon 
{
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/div[1]/a/h2")
	WebElement link;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addToCart;
	
	@FindBy(xpath="//*[@id=\"nav-logo\"]/a[1]/span[1]")
	WebElement mainPage;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")
	WebElement link1;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addTocart1;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")
	WebElement link2;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addTocart2;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")
	WebElement link3;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addTocart3;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")
	WebElement link4;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addTocart4;
}
