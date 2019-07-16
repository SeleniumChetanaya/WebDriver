package com.vasu.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmpList extends OHRM
{
@Test 
public void empList() throws Exception
{
	Thread.sleep(5000);
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Employee List")).click();
	
	List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
	for (int i = 0; i < rows.size(); i++)
	{
	List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
	System.out.println(col.size());
//	for (int j = 0; j < col.size(); j++) 
	//{
		System.out.println(col.get(2).getText());
	//}
	}
}
}
