package com.vasudeva.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws Exception 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();// ok
		//al.dismiss();//cancel
	//	al.getText();//capture text
		//al.sendKeys("VasuDeva");// Enter data

	}

}
