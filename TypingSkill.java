package com.kn.SimpleIf;

import java.util.Scanner;

public class TypingSkill {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character ");
		char ch = scan.next().charAt(0);
		boolean isCapitalLetter = isCapitalLetter(ch);
		if(isCapitalLetter==true)
		{
			System.out.println("capital letter detected ");
		}
		scan.close();
	}

	private static boolean isCapitalLetter(char ch) 
	{
		if(ch>='A' && ch<='Z')
		{
			return true;
		}
		return false;
	}

}



//output:-
/*
Enter the Character 
K
capital letter detected 

Enter the Character 
h



*/