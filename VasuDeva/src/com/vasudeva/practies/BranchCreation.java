package com.vasudeva.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreation {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://PrimusBank.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("SeleniumVasu");
		driver.findElement(By.id("txtAdd1")).sendKeys("Madhapur");
		driver.findElement(By.id("txtZip")).sendKeys("55555");
		
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		
		driver.findElement(By.id("btn_insert")).click();
	}

}
