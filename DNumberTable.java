package com.kn.Forloop;

import java.util.Scanner;

public class DNumberTable {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Num");
		int num = scan.nextInt();
		istable(num);
		scan.close();

	}

	 static void istable(int num) 
	 {
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + " * " + i + " = " +(num*i));
		}
		
	}

}
