package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHighlighter {
	
	
	
	public static void getColor(WebDriver driver,WebElement element){
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("arguments[0].style.border='3px solid red'", element);//remove red then write
	                                                                               //see next method
	    }
	//any one we can use
	  public static void getColor(WebDriver driver,WebElement element,String color){
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
	        jse.executeScript("arguments[0].style.border='3px solid "+color+"'", element);
	        
	        
	        
	    }
	
	
	
	}	
