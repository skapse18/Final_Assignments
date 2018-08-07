package com.cg.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BusStep 
{
	private WebDriver driver;
	
	@Given("^I am on Redbus login Page$")
	public void goTologinPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shkapse\\Downloads\\BDDFolder\\selenium client\\chromedriver.exe");
		driver = new ChromeDriver();
	
		System.out.println("Welcome");
		driver.get("https://redbus.in/");
		Thread.sleep(5000);
	}
	
	@And("^I enter source address as (.*)$")
	public void enterSource(String source) throws InterruptedException
	{
		 driver.findElement(By.id("src")).sendKeys(source);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]"));
		
	}
	
	@And("^then I enter destination address as (.*)$")
	public void enterDestination(String dest) throws InterruptedException
	{
		 driver.findElement(By.id("dest")).sendKeys(dest);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
		 /*driver.findElement(By.xpath("/html/body"));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
	     Thread.sleep(1000);*/
		/* driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[3]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div/label")).click();
		 Thread.sleep(1000);
	     driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
	     Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[4]/td[3]")).click();
		 Thread.sleep(1000);*/
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[2]")).click();
		
		 
	}
	
	
	@And("^I click on search$")
	public void mess() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		System.out.println("Searching for buses");
	}
	
	@And("^I click on view seats$")
	public void viewSeats() throws InterruptedException
	{
		//View Seats
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"8200309\"]/div/div[2]/div[1]")).click();
		Thread.sleep(1000);
		/*Thread.sleep(1000);
		Actions action=new Actions(driver);
		WebElement element =driver.findElement(By.xpath("//*[@id=\"rt_8200309\"]/div/div/div/div[3]/div[2]/div[2]/canvas"));
		Thread.sleep(3000);
		action.moveToElement(element).moveByOffset(524, 211).click().perform();*/
		
		
		//Action drawAction=action.moveToElement(element, , ).click()
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath("//*[@id=\"8200309\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[2]/span[2]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"8200309\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]/div")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"8200309\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"8200309\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"8200309\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")).click();
		
	}
	
	@And("^I enter name as (.*)$")
	public void information(String name) throws InterruptedException
	{
		//name
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"seatno-04\"]")).sendKeys(name);
		
	}
	
	@And("^I enter age (.*)$")
	public void getAge(String age) throws InterruptedException
	{
		//age
		Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"seatno-01\"]")).sendKeys("22");
				
	}
	
	@And("^enter gender$")
	public void getGender() throws InterruptedException
	{
		//gender
		Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"23_0\"]")).click();
	}
		
	@And("^entering email as (.*)$")
	public void getEmail(String email) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"seatno-05\"]")).sendKeys(email);
	}
	@And("^phone number as (.*)$")
	public void getNo(String num) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"seatno-06\"]")).sendKeys(num);
	}
	
	@When("^I submit form$")
	public void proceedToPay() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")).click();
	}
	@And("^I get forwaded to next page$")
	public void jhfrg()
	{
		System.out.println("forwarding.....");
	}
	
}
