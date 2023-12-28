package com.regression;

import org.testng.annotations.Test;

import com.generic.Login;

public class TestRunWithTestNGLogin {
	
	@Test(priority=0,description="Login function",groups= {"smoke","regression","Unit Test"})
	
	public  void getLogin() throws Exception {
	Login.getLoginFunction();
	
		}}		
	

