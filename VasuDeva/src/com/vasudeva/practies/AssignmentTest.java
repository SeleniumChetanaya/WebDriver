package com.vasudeva.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		
		
		Select month=new Select(driver.findElement(By.id("dob_m")));
		month.selectByIndex(5);
		Select day=new Select(driver.findElement(By.id("dob_d")));
		day.selectByIndex(5);
		Select year=new Select(driver.findElement(By.id("dob_y")));
		year.selectByIndex(5);

	}

}
