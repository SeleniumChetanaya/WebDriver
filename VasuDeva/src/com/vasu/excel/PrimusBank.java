package com.vasu.excel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank
{
	FirefoxDriver driver;
	String res;
//appLaunch
	public String  appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validation
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;

	}
	//appLogin
	public String appLogin(String username,String password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//validation
		if (driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//branchcreation
	public String branchCreation(String branchName,String add1) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("txtZip")).sendKeys("55555");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		
		driver.findElement(By.id("btn_insert")).click();
		Alert al=driver.switchTo().alert();
		String msg=al.getText();
		al.accept();
		
		//validation
		if(msg.contains("created Sucessfully"))
		{
			res="Pass";
		}else
			if(msg.contains("already Exist"))
			{
				res="Fail";
			}else
				if(msg.contains("Please fill in"))
				{
					res="Warning";
				}
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		return res;
	}
	
	//appLogout
	public String appLogout() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		if (driver.findElement(By.id("txtuId")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	
	//appClose
	public void appClose()
	{
		driver.close();
	}
	public static void main(String[] args) throws Exception 
	{
		PrimusBank app=new PrimusBank();
		//appLaunch
		app.appLaunch("Http://PrimusBank.qedgetech.com");
		app.appClose();
		//appLogin
		app.appLaunch("Http://PrimusBank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		app.appLogout();
		app.appClose();
		//BranchCreation
		app.appLaunch("Http://PrimusBank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		app.branchCreation("VasuDeva321", "Madhapur");
		app.appLogout();
		app.appClose();
	}
}
