package com.kn.WhileLoop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n= scan.nextInt();
		int squareRoot=(int)findSquareroot(n);
		System.out.println("The Square root of " + n + " is " + squareRoot);
		scan.close();
		

	}

	 static double findSquareroot(int n) 
	 {
		double squareRoot= Math.sqrt(n);
		//System.out.println("--->"+Math.pow(2,3));
		
		return squareRoot;
	}

}
