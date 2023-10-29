package com.kn.ElseIfLadder;

import java.util.Scanner;

public class IntegerCategorize {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Integer ");
		int num = scan.nextInt();
		scan.close();
		 integerCategorizer(num);
		
	}

	public static void integerCategorizer(int num)
	{
		if(num>0)
		{
			
			System.out.println("Positive");
		}
		else if(num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	
	}
}



//output:-
/*
Enter a Integer 
89
Positive

Enter a Integer 
0
Zero

Enter a Integer 
-45
Negative



*/