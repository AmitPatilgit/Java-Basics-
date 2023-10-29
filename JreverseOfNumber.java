package com.kn.Forloop;

import java.util.Scanner;

public class JreverseOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		reverseOfNumber(n);
		sc.close();
	}

	 static void reverseOfNumber(int n) 
	 {
		int s;
		for( s=1;n>0;n=n/10)
		{
			s=n%10;
			System.out.print(s);
			
		}
		
	 }

}
