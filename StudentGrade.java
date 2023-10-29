package com.kn.SimpleIfElse;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the student score ");
		int score =scan.nextInt();
		boolean isScore =isScore(score);
		scan.close();
		if(isScore==true)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

	private static boolean isScore(int score) 
	{
		if(score>=60)
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

Enter the student score 
75
Passed

Enter the student score 
55
Failed

*/