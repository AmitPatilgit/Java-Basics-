package com.kn.DoWhileLoop;

import java.util.Scanner;

public class ANumberOfDigits {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n =scan.nextInt();
		int digitCount=countDigit(n);
		System.out.println("Number of Digits in " + n + " is " + digitCount);
		scan.close();
	}

	 static int countDigit(int n) 
	 {
		int count=0;
		do {
			count++;
			n=n/10;
		}
		while(n!=0);
		return count;
	}

}
