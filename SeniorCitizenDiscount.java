package com.kn.SimpleIfElse;

import java.util.Scanner;

public class SeniorCitizenDiscount {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age of person ");
		int age = scan.nextInt();
		boolean isSeniorCitizen=isSeniorCitizen(age);
		scan.close();
		if(isSeniorCitizen==true)
		{
			System.out.println("Senior Citizen Discount Applicable ");
		}
		else
		{
			System.out.println("Regular Charges Applicable");
		}
	}

	 static boolean isSeniorCitizen(int age)
	{
		if(age>=60)
		{
		return true;
		}
		else
		{
			return false;
		}
	}

}





//output:-
/*
Enter the age of person 
65
Senior Citizen Discount Applicable 

Enter the age of person 
45
Regular Charges Applicable



*/