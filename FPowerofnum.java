package com.kn.Forloop;

import java.util.Scanner;

public class FPowerofnum {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the base num");
		int base = scan.nextInt();
		System.out.println("Enter the Exponent num");
		int exponent = scan.nextInt();
		int power = isPower(base,exponent);
		System.out.println("Power of a number is " + power);
		scan.close();
		

	}

	 static int isPower(int base, int exponent) 
	 {
		int power=1;
		for(int i=1;i<=exponent; i++)
		{
			power=power*base;
		}
		return power;
	 }

}
