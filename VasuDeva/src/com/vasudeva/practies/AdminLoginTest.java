package com.vasudeva.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.FireEvent;

public class AdminLoginTest 
{
	public static void main(String[] args)
	{
		String userName="Admin";
		String password="Admin";
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://PrimusBank.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys(userName);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		

	}

}
