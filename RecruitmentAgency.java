package com.kn.NestedIf;

import java.util.Scanner;

public class RecruitmentAgency {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Years of Experience = ");
		int Experience = scan.nextInt();
		System.out.println("Enter the Candidates Skill level = ");
		int Skill = scan.nextInt();
		scan.close();
		boolean issuitable=isSuitable(Experience,Skill);
		if(issuitable==true)
		{
			System.out.println("Suitable Candidate ");
		}
	}

	 static boolean isSuitable(int experience, int skill) 
	{
		if(experience>5)
		{
			if(skill>7)
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

Enter the Years of Experience = 
6
Enter the Candidates Skill level = 
8
Suitable Candidate 


Enter the Years of Experience = 
5
Enter the Candidates Skill level = 
6




*/
