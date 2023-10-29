package com.kn.Forloop;

import java.util.Scanner;

public class ISumOfDigits {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		sumOfDigit(n);
		scan.close();
	}

	  static void sumOfDigit(int n) 
	  {
		  int d,s;
		  for(s=0;n>0;n=n/10) 
		  {
			  d=n%10;
			  s=s+d;
			  
		  }
		  System.out.println(s);
	  }

}
