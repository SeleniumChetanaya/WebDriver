package com.vasudeva.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement shop=driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
		WebElement apv=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span"));
		Actions mouse=new Actions(driver);
		
		mouse.moveToElement(shop).build().perform();
		mouse.moveToElement(apv).click().build().perform();

	}

}
