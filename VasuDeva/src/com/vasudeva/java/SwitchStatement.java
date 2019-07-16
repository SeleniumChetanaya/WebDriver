package com.vasudeva.java;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args)
	{
		//Prg to display weekdayNames for a given number
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednessdy");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
			break;
		}

	}

}
