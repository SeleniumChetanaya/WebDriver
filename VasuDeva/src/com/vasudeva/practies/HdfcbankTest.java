package com.vasudeva.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcbankTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Hdfcbank.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginsubmit")).click();
		
		driver.quit();

	}

}
