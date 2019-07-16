package com.vasudeva.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("remember")).click();
		
		System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));// true
		
		if (driver.findElement(By.id("remember")).isSelected())
		{
			driver.findElement(By.id("remember")).click();
			System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));//null
		}

	}

}
