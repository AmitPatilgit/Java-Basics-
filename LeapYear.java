package com.kn.SimpleIfElse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year to Check Leap Year or Not ");
		int year=scan.nextInt();
		boolean isLeap=isLeapyear(year);
		scan.close();
		if(isLeap==true)
		{
			System.out.println("Leap year ");
		}
		else
		{
			System.out.println("Non-Leap year ");
		}
	}

	public  static boolean isLeapyear(int year) 
	{
		boolean isLeap=true;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					isLeap=true;
				}
				else
				{
					isLeap=false;
				}
			}
			else
			{
				isLeap=true;
			}
		}
		else
		{
			isLeap=false;
		}
		return isLeap;
	}
	
}


//output:-
/*
Enter the Year to Check Leap Year or Not 
2028
Leap year 

Enter the Year to Check Leap Year or Not 
2021
Non-Leap year 


*/