package com.vasudeva.practies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotFailure
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = null;
		try
		{
			driver=new FirefoxDriver();
		driver.navigate().to("Http://google.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.id("identifier")).sendKeys("vasu.584");
		}catch(Exception e)
		{
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcFile, new File("C:\\Users\\vasu\\Desktop\\ScreenShot\\vasu.png"));
		}

	}

}
