package com.vasu.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library 
{
	public static FirefoxDriver driver;
	String res;
//appLaunch
	public String appLaunch(String url)
	{
	  driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("fail");
			res="Fail";
		}
		return res;
	}
	// appLogin
	public String appLogin(String userName,String password)
	{

		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		//validate
		if (driver.findElement(By.id("welcome")).isDisplayed())
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("fail");
			res="Fail";
		}
		return res;
		
	}
	public String appLogout() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		//validation
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
				//System.out.println("AppLaunch Successfully");	
			res="Pass";
			}else
		{
		//System.out.println("AppLaunch Fail");
		res="Fail";
			}
	return res;
	}

	//empRegistration
	public String empReg(String fName,String lName)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		//driver.findElement(By.id("photofile")).click();
		driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
		/*Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fileupload.exe");
		
		Thread.sleep(2000);*/
		
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
		{
			
			res="Pass";
		}else
		{
			
			res="Fail";	
		}
		return res;
	}
	
	
	public static void main(String[] args) 
	{
		Library app=new Library();
		//app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		String results=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		System.out.println(results);
		System.out.println(app.appLogin("Admin","Admin"));
	}
}
