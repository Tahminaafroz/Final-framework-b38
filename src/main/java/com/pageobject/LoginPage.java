package com.pageobject;

import org.openqa.selenium.By;

import com.generic.Login;
import com.util.BaseConfig;

public class LoginPage {
	//store all login related xpath
    //which datatype to use= WebElement	part of application
    //PF or POM concept
	//PF= @FindBy
	//POM=By()
	//for go anywhere access 
public	By user =By.xpath("//*[@name='email'][1]");
public	By pass =By.xpath("//*[@name='password']");
public	By loginbtn=By.xpath("//*[@class='btn btn-default'][1]");

public By logoutbtn=By.xpath("//*[text()='Logout']");



	// these are all non static .its an object.
//now go to Generic page and make and object
	
	
	
}
