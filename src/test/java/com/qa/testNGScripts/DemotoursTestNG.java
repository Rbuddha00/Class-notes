package com.qa.testNGScripts;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemotoursTestNG {
      
	

	public static WebDriver driver;
	
	@BeforeClass
	 public void mainpage() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win7\\Documents\\Ranjita Code\\Java\\Learn_Java\\Selenium\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
	}
	@Test 
	public void signin()
	{
		driver.findElement(By.name("userName")).sendKeys("Username1");
		driver.findElement(By.name("password")).sendKeys("Password1");
		driver.findElement(By.name("login")).click();
	
	
	}
	
	@AfterClass()
	public void close()
	{
		driver.close();
	}
	
		
	 }
	
	 
	
	

