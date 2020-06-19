package com.qa.testNGScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	private static final String Priority = null;

	@BeforeClass 
	public void sogin()
	
	{
		System.out.println("Login as class");
		
	}

	
	 @BeforeTest 
	 public void print() {
		 System.out.println(" print this priority Test");
		 
	 }
	 
	 @Test 
	 public void point() {
		 System.out.println(" print this ");
	 }
	 
	 @BeforeMethod 
	 public void blan()
	 {
		 System.out.println("Print this Method");
	 }
	 
	 @BeforeSuite 
	 public  void bsuit()
	 {
		 System.out.println("Print this Suit");
	 }
	 
	 @Test (priority= 1)
	 public void loint() {
		 System.out.println(" print this priority 1");
	 }
	 
	 
	 @Test (priority= 2)
	 public void lointo() {
		 System.out.println(" print this priority 2");
	 }
	 
}
