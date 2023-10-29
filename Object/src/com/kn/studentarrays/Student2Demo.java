package com.kn.studentarrays;

import java.util.Scanner;

public class Student2Demo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Objects to be Created = ");
		
		
		Student2 [] srr = new Student2 [scan.nextInt()];
		for(int i=0;i<srr.length;i++)
		{
			System.out.println("Enter Id for Student " +(i+1));
			int id=scan.nextInt();
			
			System.out.println("Enter Name for Student " +(i+1));
			String name=scan.next();
			
			System.out.println("Enter Marks for Student " +(i+1));
			int marks=scan.nextInt();
			srr[i]=new Student2(id,name,marks);
		}
		
		for(int i=0;i<srr.length;i++)
		{
			System.out.println("\n ID = " + srr[i].id + " \n Name = " + srr[i].name + " \n Marks = " + srr[i].marks);
		}

		System.out.println("======================Student Data====================");
		
		System.out.println("Enter the Id to be Searched ");
		int search = scan.nextInt();
		
		
		int low=0,high=srr.length-1;
		
		boolean isFound=false;
		int mid=0;
		while(low<=high)
		{
			
			mid=(low+high)/2;
			if(search==srr[mid].id)
			{
				isFound=true;
				break;
				
			}
			
			else if(search>srr[mid].id)
			{
				low=mid+1;
				
			}
			else 
			{
				high=mid-1;
				
			}
			
		}
		if(isFound)
		{
			System.out.println("Id = " +srr[mid].id + " , Name =" +srr[mid].name + " , Marks = "+srr[mid].marks);
		}
		else
		{
			System.out.println("Id "+ search + " not found");
		}
		
		
		
		
				scan.close();
	

	}

}
