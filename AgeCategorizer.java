package com.kn.ElseIfLadder;

import java.util.Scanner;

public class AgeCategorizer {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scan.nextInt();
		scan.close();
		isage(age);
	}

	 static void isage(int age) 
	{
		if(age>=0 && age<=12)
		{
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) 
		{
			System.out.println("Teenage");
		}
		else if (age>=20 && age<=59)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior Citizen");
		}
	}

}
//output:-
/*
Enter the age
6
Child

Enter the age
30
Adult

Enter the age
65
Senior Citizen






*/