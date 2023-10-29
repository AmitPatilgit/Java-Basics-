package com.kn.Forloop;

import java.util.Scanner;

public class ASumOfNnaturalNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=scan.nextInt();
		int sum = isNaturalnum(num);
		System.out.println("The sum of given " + num + " is " +sum);
		scan.close();
	}

	 static int isNaturalnum(int num) 
	 {
		 int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		return sum;
		
	 }

}
