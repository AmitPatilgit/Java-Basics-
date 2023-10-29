package com.kn.Forloop;

import java.util.Scanner;

public class GPrimeNumber 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the  number : ");
		int n = scan.nextInt();
		scan.close();
		isPrimenum(n);
//		boolean prime =isPrime( n);
//		if(prime == true) 
//		{
//			System.out.println(n + " is Prime Number" );
//		}
//		else
//		{
//			System.out.println(n + " is Not a Prime number ");
//		}
	}

	 static void isPrimenum(int n) 
	 {
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) 
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The Given number " + n + " is a Prime Number "  );
		}
		else
		{
			System.out.println("The Given number " + n + " is Not a Prime Number ");
		}
		
	}

	

//	 static boolean isPrime(int n) 
//	 {
//		 boolean isPrime=true;
//	for(int i=2;i<n;i++)
//		{
//			if(n%i==0) 
//	 		{
//				isPrime=false;
//				break;
//			}
//		}
//		return isPrime;
//	}

}
