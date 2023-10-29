package com.kn.DoWhileLoop;

import java.util.Scanner;

public class DAverageOfNnumber {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  number");
		int n=scan.nextInt();
		averageOfNumber(n);
		scan.close();

	}

	 static void averageOfNumber(int n) 
	 {
		 int i=1;
			int sum=0;
			double avg=0.0;
			do {
				sum=sum+i;
				System.out.println(sum);
				i++;
			}while(i<=n);
			avg=(double)sum/n;
			System.out.println("average= "+avg);
		
	 }

}
