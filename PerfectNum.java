package com.kn.WhileLoop;

import java.util.Scanner;

public class PerfectNum 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n =scan.nextInt();
		isPerfectNum(n);
		scan.close();
	}

	 static void isPerfectNum(int n) 
	 {
		 
				int sum=0,i=1;
			    while(i<n)
			   {
				 if(n%i==0)
				  {
					sum=sum+i;
				  }
				i++;
			   
				if(sum==n)
				{
					System.out.println(n + " is Perfect Num ");
				}
				
			  }
	}
		
	


	
}
