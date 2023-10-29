package com.kn.SwitchCase;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Product code ");
		int code = scan.nextInt();
		isProduct(code);
		scan.close();

	}

	 static void isProduct(int code)
	 {
		switch(code)
		{
		case 1 :
					System.out.println("Coke");
					break;
		case 2 :
					System.out.println("Pepsi");
					break;
		case 3 :
					System.out.println("Water");
					break;
		case 4 :
					System.out.println("Jucie");
					break;
		case 5 :
					System.out.println("Tea");
					break;
		}
		
	 }

}


//output:-
/*

Enter the Product code 
1
Coke

Enter the Product code 
5
Tea





*/