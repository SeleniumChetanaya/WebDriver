package com.vasudeva.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		//System.out.println(parent);
		
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> windows=driver.getWindowHandles();
		
		List<String> tabs=new ArrayList(windows);
		
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.close();
		/*Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		/*for (String child : windows)
		{
			//System.out.println(child);
			driver.switchTo().window(child);
			if(!driver.getTitle().equals("NetBanking"))
			{
				driver.close();
			}
			
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
		}*/
		

	}

}
