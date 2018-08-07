package com.cg.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class ExcelReader
{
	//String path="D:\\Users\\shkapse\\Downloads\\BDDFolder\\BDD Workspace\\Excel.xlsx";
	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shkapse\\Downloads\\BDDFolder\\selenium client\\chromedriver.exe");
	//	driver = new ChromeDriver();
		
	//	driver.get("D:\\Users\\shkapse\\Downloads\\BDDFolder\\BDD Workspace\\153055_ReadingExcel\\src\\main\\webapp\\excelRead.html");
	}
	
	@Given("^Opening excel sheet$")
	public void getCell() throws IOException
	{
		
		 FileInputStream fi = new FileInputStream("D:\\Users\\shkapse\\Downloads\\BDDFolder\\BDD Workspace\\Excel.xlsx");
		 XSSFWorkbook wb = new XSSFWorkbook(fi);
		 XSSFSheet sh=wb.getSheetAt(0);
		
		 int row=sh.getPhysicalNumberOfRows();

		 
		 for(int i=0;i<row;i++)
		 {
			 driver = new ChromeDriver();
		   	 driver.get("D:\\Users\\shkapse\\Downloads\\BDDFolder\\BDD Workspace\\153055_ReadingExcel\\src\\main\\webapp\\excelRead.html");
			 String fName=sh.getRow(i).getCell(0).toString();
			 driver.findElement(By.id("firstname")).sendKeys(fName);
			 
			 String mName=sh.getRow(i).getCell(1).toString();
			 driver.findElement(By.id("middlename")).sendKeys(mName);
			 
			 String lName=sh.getRow(i).getCell(2).toString();
			 driver.findElement(By.id("lastname")).sendKeys(lName);
			 
			 driver.findElement(By.id("submit")).click();
			 driver.switchTo().alert().accept();
		 }
	}
}
