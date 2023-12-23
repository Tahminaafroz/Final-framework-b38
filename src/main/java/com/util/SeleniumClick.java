package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumClick {
	//How to click in the Action class?
	public void getActionClick(WebDriver driver,WebElement element)	{

	Actions act=new Actions(driver);
		act.click(element).perform();
	}	
		
	public void javaScriptclick(WebDriver driver,WebElement element)	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;//type casting
		executor.executeScript("arguments[0].click();", element);
		
		
		
	}}
	
    //Interface Instantiation=Y/N= No
   //How to handle
   //Create object with the help of other class known as=Up casting(Upper level person helping)
   //like driver helping to create an object
   //=it is called type casting

