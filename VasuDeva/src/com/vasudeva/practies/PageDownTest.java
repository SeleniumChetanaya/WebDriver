package com.vasudeva.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://facebook.com");
		driver.manage().window().maximize();
		
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN);
		
		driver.findElement(By.linkText("Create a Page")).click();

	}

}
