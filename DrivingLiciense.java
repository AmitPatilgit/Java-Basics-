package com.kn.NestedIf;

import java.util.Scanner;

public class DrivingLiciense {

	public static void main(String[] args)
	{
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter your age");
	int age=scan.nextInt();
	System.out.println("Enter the Eyesight score");
	int Eyesight =scan.nextInt();
	scan.close();
	boolean drivingLiciense = isEligible(age,Eyesight);
	if(drivingLiciense==true)
	{
		System.out.println("Driving Liciense Eligible");
	}
	

	}

	 static boolean isEligible(int age , int Eyesight) 
	{
		if(age>=18)
		{
			if(Eyesight>=6)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}

}


//output:-
/*

Enter your age
20
Enter the Eyesight score
7
Driving License Eligible




Enter your age
20
Enter the Eyesight score
5



*/