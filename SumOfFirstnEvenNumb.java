package com.kn.WhileLoop;

import java.util.Scanner;

public class SumOfFirstnEvenNumb {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int n = scan.nextInt();
		SumofFirstnOdd(n);
		scan.close();
		
	}

	 static void SumofFirstnOdd(int n) 
	 {
		 int i=1;
		 while(i<=n) 
		 {
			 if(i%2==0) {
				 System.out.print(i + " ");
			 }
			 i++;
		 }
		 
		 System.out.println();
	}

}
