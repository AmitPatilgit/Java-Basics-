package com.kn.SimpleIf;

import java.util.Scanner;

public class VoterReg {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of a Person ");
		int age = scan.nextInt();
		boolean isEligibile = isEligible(age);
		if(isEligibile==true)
		{
			System.out.println("Voter Registration eligible");
		}
		scan.close();
	}

	private static boolean isEligible(int age) 
	{
		if(age>=18)
		{
			return true;
		}
		return false;
		
	}

}



//output:-
/*
Enter the age of a Person 
21
Voter Registration eligible

Enter the age of a Person 
17




*/