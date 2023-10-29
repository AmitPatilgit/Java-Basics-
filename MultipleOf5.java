package com.kn.SimpleIfElse;

import java.util.Scanner;

public class MultipleOf5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = scan.nextInt();
		scan.close();
		boolean multiple = multiple(number);
		if(multiple==true)
		{
			System.out.println("Multiple of 5 ");
		}
		else
		{
			System.out.println("Not a Multiple of 5 ");
		}
	}

	private static boolean multiple(int number) 
	{
		if(number%5==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}


//output:-
/*
 
 Enter a number 
20
Multiple of 5 


Enter a number 
23
Not a Multiple of 5
 
 
 
 */



