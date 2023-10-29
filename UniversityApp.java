package com.kn.NestedIf;

import java.util.Scanner;

public class UniversityApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the GPA of the student ");
		double GPA = scan.nextDouble();
		System.out.println("Enter the total credits ");
		int credits=scan.nextInt();
		System.out.println("Enter the number of courses completed ");
		int course=scan.nextInt();
		scan.close();
		boolean Eligibleforhonordegree=isEligibleforhonordegree(GPA,credits,course);
		if(Eligibleforhonordegree==true)
		{
			System.out.println("Eligible for Honors Degree ");
		}
	}

	 static boolean isEligibleforhonordegree(double GPA , int credits,int course) 
	{
		if(GPA>3.5 && credits>120)
		{
			if(course>=4 && course<=10)
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

Enter the GPA of the student 
3.7
Enter the total credits 
125
Enter the number of courses completed 
5
Eligible for Honors Degree 


Enter the GPA of the student 
3.3
Enter the total credits 
130
Enter the number of courses completed 
5





*/