package com.kn.NestedIf;

import java.util.Scanner;

public class MagicSquareChecker {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the side length a : ");
		int a= scan.nextInt();
		System.out.print("Enter the side length b : ");
		int b = scan.nextInt();
		scan.close();
		 isSquare(a,b);
		
	}

	 static void isSquare(int a, int b) 
	{
		if(a==b)
		{
			System.out.println("the rectangle sides are square ");
			if(a*b==a)
			{
				System.out.println("Magic");
			}
			else
			{
				System.out.println(" ");
			}
		}
		else
		{
			System.out.println(" ");
		}
		 
	}

}
