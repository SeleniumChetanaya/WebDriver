package com.vasudeva.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_d")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
	
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
	}

}
