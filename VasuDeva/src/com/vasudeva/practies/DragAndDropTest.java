package com.vasudeva.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	/*List<WebElement> frames=driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());*/
		
	//driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
	driver.switchTo().frame(frame1);
		WebElement drg=driver.findElement(By.id("draggable"));
		WebElement drp=driver.findElement(By.id("droppable"));
		
		Actions dAd=new Actions(driver);
		dAd.dragAndDrop(drg, drp).build().perform();
	}

}
