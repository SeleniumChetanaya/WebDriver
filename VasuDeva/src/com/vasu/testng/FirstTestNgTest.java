package com.vasu.testng;

import org.testng.annotations.Test;

public class FirstTestNgTest 
{

	@Test(priority=1,enabled=false)
	public void appLaunch()
	{
		System.out.println("AppLaunch");
	}
	@Test()
	public void appLogin()
	{
		System.out.println("AppLogin");
	}
	@Test(priority=3)
	public void appClose()
	{
		System.out.println("AppCLose");
	}
}
