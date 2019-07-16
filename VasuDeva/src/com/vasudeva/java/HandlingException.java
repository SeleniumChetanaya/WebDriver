package com.vasudeva.java;

public class HandlingException {

	public static void main(String[] args)
	
	{
		System.out.println("Selenium");
		try
		{
			
		System.out.println(100/0);
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("VasuDeva");

	}

}
