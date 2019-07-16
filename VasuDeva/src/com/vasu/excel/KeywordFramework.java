package com.vasu.excel;

import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywordFramework {

	public static void main(String[] args)
	{
		
		String userName="Admin";
		String password="Admin";
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://PrimusBank.qedgetech.com");
		driver.manage().window().maximize();
	}

}
