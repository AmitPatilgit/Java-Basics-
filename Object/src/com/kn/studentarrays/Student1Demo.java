package com.kn.studentarrays;

import java.util.Scanner;

public class Student1Demo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Objects to be Created = ");
		int numberOfObject=scan.nextInt();
		
		Student1 [] srr = new Student1 [numberOfObject];
		for(int i=0;i<srr.length;i++)
		{
			System.out.println("Enter Id for Student " +(i+1));
			int id=scan.nextInt();
			
			System.out.println("Enter Name for Student " +(i+1));
			String name=scan.next();
			
			System.out.println("Enter Marks for Student " +(i+1));
			int marks=scan.nextInt();
			srr[i]=new Student1(id,name,marks);
		}
		
		
		
		for(int i=0;i<srr.length;i++)
		{
			System.out.println("\n ID = " + srr[i].id + " \n Name = " + srr[i].name + " \n Marks = " + srr[i].marks);
		}
		scan.close();
	}

}
