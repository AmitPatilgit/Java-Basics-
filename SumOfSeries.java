package com.kn.WhileLoop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		double sum =findSumOfSeries(n);
		scan.close();
		System.out.println(sum);

	}

	 static double findSumOfSeries(int n)
	 {
		int i=1; double sum=0.0;
		while(i<=n)
		{
			
				sum=sum+(1.0/i);
				i++;	
		}
			
		
		
		return sum;
		
		
	}

}
