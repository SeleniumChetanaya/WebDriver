package com.vasu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	 @FindBy(id="txtUsername")
	WebElement username; //page objects
	 @FindBy(id="txtPassword")
		WebElement password;
	 @FindBy(id="btnLogin")
		WebElement login;
	 //method
	 public void login()
	 {
		 username.sendKeys("Admin");
		 password.sendKeys("Qedge123!@#");
		 login.click();
	 }
	 
	
}
