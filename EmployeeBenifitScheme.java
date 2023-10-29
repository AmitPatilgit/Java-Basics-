package com.kn.SwitchCase;

import java.util.Scanner;

public class EmployeeBenifitScheme {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year of Service : ");
		int yearOfservice=scan.nextInt();
		System.out.print("Enter monthly targets : ");
		int monthlyTargets=scan.nextInt();
		isBonusEligible(yearOfservice,monthlyTargets);
		scan.close();

	}

	 static void isBonusEligible(int yearOfservice, int monthlyTargets) 
	 {
		switch(yearOfservice)
		{
		case 1:
		case 2:
		case 3:
			System.out.println("Not eligible for bonus.");
			break;
		default:
			if(monthlyTargets>6)
			{
				System.out.println("Bonus Eligible");
			}
			else
			{
				System.out.println("Not eligible for bonus");
			}
		}
		
	 }

}
