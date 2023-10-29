package com.kn.NestedIf;

import java.util.Scanner;

public class passedAllAndAverageScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the test1 score of the student : ");
		int marks1 = scan.nextInt();
		System.out.print("Enter the test2 score of the student : ");
		int marks2 = scan.nextInt();
		System.out.print("Enter the test3 score of the student : ");
		int marks3 = scan.nextInt();
	isPassAndAverage(marks1,marks2,marks3);
	scan.close();
	}
	
	static void isPassAndAverage(int marks1,int marks2,int marks3)
	{
	if(  marks1>=50 )	
	{
	 if(marks2>=50)
	 {
		 if(marks3>=50)
		 {
			 System.out.println(" Passed All ");
		 }else
		 {
			 System.out.println(" ");
		 }
	 }
	}
	if((marks1+marks2+marks3)/3>50)
	{
		System.out.println(" The Average score is passed ");
	}else {
		System.out.println("   ");
	}
	}
}