package com.qa.testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class demoprallelTestNG {

	@Parameters({ "UserName", "Password" })
	@Test
	public void login(String Username, String Password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win7\\Documents\\Ranjita Code\\Java\\Learn_Java\\Selenium\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		driver.close();

	}



     
}
	

