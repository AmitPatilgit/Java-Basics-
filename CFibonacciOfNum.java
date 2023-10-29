package com.kn.Forloop;

import java.util.Scanner;

public class CFibonacciOfNum {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the range :");
		int range = scan.nextInt();
		scan.close();
		printFibonacciSeries(range);
		
	}

	 static void printFibonacciSeries(int range) 
	 {
		int firstnum=0 , secondnum=1, third=0;
		System.out.println("The First Number Of Series is  " + firstnum +    " The Second Number of the Series is " + secondnum);
		for(int i=3;i<=range;i++)
		{
			 third=firstnum + secondnum;
			firstnum=secondnum;
			secondnum=third;
			//if(third<=range) 
			//{
				//System.out.println(third);
			//}
			System.out.println("The Fibonacci Series are " + third);
		}
		
	}

}
