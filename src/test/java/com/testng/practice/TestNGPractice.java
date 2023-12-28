package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	
@BeforeSuite
public void beforeSuite(){
	System.out.println("Before suite:Before everything");
}
@BeforeTest
public void setup (){
	System.out.println("Before tets:setup");
}
@BeforeClass
public void beforeClass (){
	System.out.println("Before class:setup all classes");
}
@BeforeMethod
public void beforeMethod (){
	System.out.println("Before Method:Befor each test ");
}
	@Test
	public void getlogin(){
	System.out.println("login test");	
		
	}
	
	@Test
	public void getProduct(){
	System.out.println("Product test");	
		
	}
	@Test
	public void getPayment(){
	System.out.println("Payment test");	
		
	}
	@AfterMethod
	public void afterMethod (){
	System.out.println("AfterMethod:After each test");	
		
	}
	@AfterClass
	public void afterClass (){
	System.out.println("Afterclass:After all classes");	
		
	}
	@AfterTest
	public void teardown (){
	System.out.println("Aftertest:close all connection");	
		
	}
	@AfterSuite
	public void afterSuite (){
	System.out.println("AfterSuite:After all tests");	
		
	}

}
