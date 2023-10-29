package com.kn.ElseIfLadder;

import java.util.Scanner;

public class DifferentTypeOfChar {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character ");
		char ch = scan.next().charAt(0);
		scan.close();
		CharIdentifier(ch);
		
		
	}

	public static void CharIdentifier(char ch) 
	{
		if(ch>='a' && ch<='z')
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch + " is lowercase Vowels");
			}
			else
			{
				System.out.println(ch + " is lowercase consonant");
			}
		}
		else if(ch>='A' && ch<='Z') 
		{
			if(ch=='A'  || ch=='E' || ch=='I'  || ch=='O' || ch=='U')
			{
				System.out.println(ch + " is Uppercase Vowels");
			}
			else
			{
				System.out.println(ch + " is uppercase consonant ");
			}
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
		
	}

}


//output:-

/*
Enter a Character 
f
lowercase consonant


Enter a Character 
A
Uppercase Vowels

Enter a Character 
$
Special Character



*/