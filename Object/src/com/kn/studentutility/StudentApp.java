package com.kn.studentutility;

import java.util.Scanner;



public class StudentApp {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Objects to be Created = ");
		
		
		Student[] srr = new Student[scan.nextInt()];
		for(int i=0;i<srr.length;i++)
		{
			System.out.println("Enter Id for Student " +(i+1));
			int id=scan.nextInt();
			
			System.out.println("Enter Name for Student " +(i+1));
			String name=scan.next();
			
			System.out.println("Enter Marks for Student " +(i+1));
			int marks=scan.nextInt();
			
			srr[i]=new Student(id,name,marks);
		}
		
		StudentUtility su = new StudentUtility();
		
		System.out.println("Enter stuent id");
		int searchID = scan.nextInt();
		su.SearchByid(srr,searchID);
		
		System.out.println("==================================================================\n");
		
		
		System.out.println("Enter Student name ");
		String searchName = scan.next();
		su.searchByName(srr,searchName);
		
		
		System.out.println("==================================================================\n");
		
		System.out.println("Sort Student By Marks: \n");
		su.sortBymarks(srr);
		for(int i=0;i<srr.length;i++)
		{
			System.out.println(" \n ID = "+srr[i].id + " \n Name = "+ srr[i].name + " \n Marks = " + srr[i].marks );
		}
		
		
		System.out.println("==================================================================\n");
		
		
		System.out.println("Apply Grace marks for the student who failed : \n");
		su.applyGrace(srr);
		
		
		
		System.out.println("==================================================================");
	
		System.out.println("Rate Application from (1-5) ");
		int rate = scan.nextInt();
		su.rateApp(rate);
		
scan.close();
	}

}
