package com.kn.DoWhileLoop;

import java.util.Scanner;

public class BProductOfNEvenNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		long product=CalculateProductOfEvenNumber(n);
		System.out.println("Product of first " + n + " Even number is " + product);
		scan.close();
	}

	 static long CalculateProductOfEvenNumber(int n)
	 {
		int prod=1,count=0;int num=2;
		do
		{
			prod=prod*num;
			num=num+2;
			count++;
		}while(count<n);
		return prod;
	}

}
