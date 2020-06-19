package com.qa.testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;




public class RediffTestNG {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void configuration() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com");
		Reporter.log(" we used google chrome");
	}
	
	@Test (priority = 1)
	public void homepage()
	{
		
		driver.findElement(By.className("mailicon")).click();
		
	}
	
	
	
	
	@Test(priority = 2)
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("login1")).sendKeys("aaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		
	}
	
	@Test(priority = 3)
	public void text()
	{
		Alert A = driver.switchTo().alert();
		String text = A.getText();
		System.out.println(text);
		A.accept();
	}
	
	
	
	@AfterClass()
    public void close()
    {
    	driver.close();
    }
	 

	
	}


