package com.kn.SimpleIfElse;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number to check Positive or Neagative ");
		int number = scan.nextInt();
		boolean isPositive = isPositive(number);
		if (isPositive == true )
		{	
			System.out.println("The given number " + number + " is Positive ");
		}
		else 
		{
			System.out.println("The given number " + number + " is Negative ");
		}
		scan.close();
	}

	 static boolean isPositive(int number) 
	{
		if(number>0)
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
Enter a number to check Positive or Negative 
27
The given number 27 is Positive 



Enter a number to check Positive or Negative 
-12
The given number -12 is Negative 





*/