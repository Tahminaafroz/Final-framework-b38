package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobject.LoginPage;
import com.util.BaseConfig;
import com.util.SeleniumHighlighter;

public class Login {
	
	
	public static void getLoginFunction() throws Exception {
	    // open a browser
		WebDriver driver=new ChromeDriver();
		BaseConfig obj=new BaseConfig();
		//driver.get("https://automationexercise.com");
		driver.get(obj.getConfig("URL"));//go url
		
		//driver.manage()	.window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//wait for all whole page loading all graphics=Automation going to slow
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//wait for HTML load=slow down automation speed
		LoginPage  pom=new LoginPage ();
		//here obj is coming red so we write another object name pom
        driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
        //sign in xpath
        
        SeleniumHighlighter.getColor(driver,driver.findElement(pom.user),"red");//highlight
        driver.findElement(pom.user).sendKeys(obj.getConfig("USERNAME"));
        
        SeleniumHighlighter.getColor(driver,driver.findElement(pom.pass),"green");//highlight
        driver.findElement(pom.pass).sendKeys(obj.getConfig("PASSWORD"));
        Thread.sleep(2000);
        SeleniumHighlighter.getColor(driver, driver.findElement(pom.loginbtn),"black");//highlight
         driver.findElement(pom.loginbtn).click();
         
         Thread.sleep(2000);//wait little 4sec
     	driver.close();
       WebElement logout=driver.findElement(pom.logoutbtn);
      // Explicit wait
       //SeleniumWait .getExplicitWait(driver, logout);
        //driver.findElement(By.xpath("")).sendKeys("");
        //driver.close();//close only current tab/Browser .Driver not close
		//driver.quit();//close all Browser and Driver
		//boolean logoutFound=logout.isDisplayed();
		//System.out.println(logoutFound);
		
	//Thread.sleep(3000);
	//driver.close();
	}
	public static void main(String[] args) throws Exception {
		Login.getLoginFunction();
	

		
		
	}}	
		
		
		

