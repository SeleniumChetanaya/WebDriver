package com.vasudeva.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://bing.com");
		driver.manage().window().maximize();
		
		//identify header section
		WebElement header=driver.findElement(By.className("sw_tb"));
		//identify links under header
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		for (int i = 0; i < headerLinks.size(); i++)
		{
			System.out.println(headerLinks.get(i).getText());
		}

	}

}
