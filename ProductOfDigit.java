package com.kn.WhileLoop;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int digit=isProduct(n);
		System.out.println("The Product of Each digit of the number " + n + " is " + digit);
		sc.close();

	}

	 static int isProduct(int n) 
	 {
		 int d=1,Prod=1;
		 while(n>0)
		 {
			 d=n%10;
			 Prod=Prod*d;
			 n=n/10;
		 }
		return Prod;
		 
		
	}

}
