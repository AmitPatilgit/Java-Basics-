package com.kn.Forloop;

import java.util.Scanner;

public class LSumOfSquaresOfnNmber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		sumOfSquare(n);
		scan.close();
	}

	 static void sumOfSquare(int n) 
	 {
		 int s=0;
		 for(int i=1;i<=n;i++)
		 {
			 s=s+(i*i);
		 }
		 System.out.println(s);
     }

}
