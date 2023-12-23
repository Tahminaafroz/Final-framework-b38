package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {

	
	//interview=0,
		public String getConfig(String value) throws Exception{
		                                            //first get file path
		String filepath="./config.properties";
	                                   //then convert file(note pad) into stream=java dev class:FileInputStream
		FileInputStream	 fis=new FileInputStream(filepath);
		                                 //read config file= java dev use a class =Properties
		Properties pro=new Properties();
		pro.load(fis);
		
		                                            //get each value
		String eachValue=pro.get(value).toString();//VERY SENSITIVE=make sure all are accurate with your file
		//System.out.println(eachValue);
		return eachValue;
		
	}
	public static void main(String[] args) throws Exception {
		BaseConfig obj=new BaseConfig();
		obj.getConfig("PASSWORD");
	}	


	}


