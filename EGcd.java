package com.kn.Forloop;

import java.util.Scanner;

public class EGcd 
{//GCD or HCF

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int n1= scan.nextInt();
		System.out.print("Enter the second number : ");
		int n2 = scan.nextInt();
		int Gcdofnum=isGcd(n1,n2);
		scan.close();
		System.out.println("The Highest Common Factor between the " + n1 + " and " + n2 + " is " +Gcdofnum);
	}

	 private static int isGcd(int n1, int n2) 
	 {
		int gcd=1;
		for(int i=1; i<=n1 && i<=n2 ; i++)
		{
			if(n1%i==0 && n2%i==0) 
			{
				gcd=i;
			}
		}
		return gcd;
	
	 }


}
