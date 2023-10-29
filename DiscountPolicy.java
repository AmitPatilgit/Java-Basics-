package com.kn.SimpleIf;

import java.util.Scanner;

public class DiscountPolicy {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Total Purchase amount ");
		int amount = scan.nextInt();
		boolean isPurchaseamount=isPurchaseamount(amount);
		if(isPurchaseamount==true)
		{
			System.out.println("Discount of 20% applicable ");
		}
		scan.close();
	}

	private static boolean isPurchaseamount(int amount) 
	{
		if(amount>200)
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
Enter the Total Purchase amount 
250
Discount of 20% applicable 

Enter the Total Purchase amount 
180


*/