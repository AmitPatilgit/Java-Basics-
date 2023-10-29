package com.kn.SimpleIfElse;

import java.util.Scanner;

public class BalanceAmount {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Balance amount ");
		int amount = scan.nextInt();
		boolean isBalance=isBalance(amount);
		scan.close();
		if(isBalance==true)
		{
			System.out.println("Positive Balance");
		}
		else 
		{
			System.out.println("Negative Balance ");
		}
		
	}

	 static boolean isBalance(int amount) 
	{
		if(amount>0)
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
Enter the Balance amount 
500
Positive Balance

Enter the Balance amount 
-200
Negative Balance 



*/