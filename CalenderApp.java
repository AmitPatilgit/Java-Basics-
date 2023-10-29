package com.kn.NestedIf;

import java.util.Scanner;

public class CalenderApp 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year ");
		int year = scan.nextInt();
		scan.close();
		isLeapyearandcentury(year);
	
	}

	 static void isLeapyearandcentury(int year) 
	{
		if((year%4==0 && year/100!=0) || year%400==0)
		{
		     if(year>=2000 && year<=2100)
			 {
				 System.out.println("21st Century Leap Year");
			 }
			 else
			 {
				 System.out.println("Leap year");
			 }
		}
	}
}


//output:-
/*
Enter the Year 
2024
21st Century Leap Year

Enter the Year 
1996
Leap year



*/
