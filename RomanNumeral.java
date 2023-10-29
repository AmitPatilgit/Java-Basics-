package com.kn.SwitchCase;

import java.util.Scanner;

public class RomanNumeral {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the Roman Number : ");
		String c = scan.next();
		isDecimalOrNot(c);
		scan.close();

	}

	 static void isDecimalOrNot(String c) 
	 {
		switch(c) 
		{
			case "I" :
						System.out.println("1");
						break;
			case "II" :
						System.out.println("2");
						break;
			case "III" :
						System.out.println("3");
						break;
			case "IV" :
						System.out.println("4");
						break;
			case "V" :
						System.out.println("5");
						break;
			default:
						System.out.println();
		}
		
	}

}


//output:-

/*

Enter the Roman Number 
IV
4

Enter the Roman Number 
I
1





*/