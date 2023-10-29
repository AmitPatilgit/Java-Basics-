package com.kn.WhileLoop;

import java.util.Scanner;

public class FindTheLargestDigitInNumber {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = scan.nextInt();
		int res=isLargest(n);
		scan.close();
		System.out.println("The Largest Digit is " + res);
		

	}

	 static int isLargest(int n) 
	 {
		 int d=1,temp=1;
		 while(n>0)
		 {
			 d=n%10;
			 if(d>temp)
			 {
				 temp=d;
			 }
			 
			 n=n/10;
		 }
		return temp;
	}

}
