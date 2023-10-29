package com.kn.SimpleIf;

import java.util.Scanner;

public class PositiveNumberOnly
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number to check Positive or Negative ");
		int number = scan.nextInt();
		boolean Positivenum = Positive(number);
		if (Positivenum == true )
		{	
			System.out.println(" Positive number - processing... " );
		}
		
		scan.close();
	}

	 static boolean Positive(int number) 
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
 Positive number - processing... 
  
Enter a number to check Positive or Negative 
-12

  
  
*/



