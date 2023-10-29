package com.kn.Forloop;

import java.util.Scanner;

public class BFactorialOfNum {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = scan.nextInt();
		int factorial=findFactorial(n);
		scan.close();
		System.out.println("Factorial of " + n + " is " + factorial);

	}

	 static int findFactorial(int n) 
	 { 
		 int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}

}
