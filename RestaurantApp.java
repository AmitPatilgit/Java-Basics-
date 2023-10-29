package com.kn.SwitchCase;

import java.util.Scanner;

public class RestaurantApp {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of the day ");
		int day= scan.nextInt();
		isSpecialDishOfThatDay(day);
		scan.close();

	}

	 static void isSpecialDishOfThatDay(int day) 
	 {
		switch(day)
		{
		case 1 :
			System.out.println(" Monday - Pasta");
			break;
		case 2 :
			System.out.println(" Tuesday - Tacos");
			break;
		case 3 :
			System.out.println(" Wednesday - Sushi");
			break;
		case 4 :
			System.out.println(" Thursday - Steak");
			break;
		case 5 :
			System.out.println(" Friday - Pizza");
			break;
		case 6 :
			System.out.println(" Saturday - Lobster");
			break;
		case 7 :
			System.out.println(" Sunday - Brunch");
			break;
		}
		
	 }

}


//output:-

/*
 Enter the number of the day 
1
Pasta
 
 Enter the number of the day 
5
Pizza
 
 
 
 */

