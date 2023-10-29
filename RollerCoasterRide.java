package com.kn.SimpleIf;

import java.util.Scanner;

public class RollerCoasterRide {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The age of visitor : ");
		int age = scan.nextInt();
		boolean isOlder=isOlder(age);
		if(isOlder==true)
		{
			System.out.println("Ride access granted ");
		}
		scan.close();
	}

	private static boolean isOlder(int age) 
	{
		if (age>12)
		{
			return true;
		}
		return false;
		
	}

}






//output :-
/*
Enter The age of visitor : 
15
Ride access granted 


Enter The age of visitor : 
9





*/