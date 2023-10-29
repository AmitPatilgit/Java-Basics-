package com.kn.Forloop;

import java.util.Scanner;

public class MAllEvenNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		
		scan.close();
		isEvennum(n);
		
	}
	

	 static void isEvennum(int n) 
	 {
		 for(int i=0;i<=n;i++)
		 {
			 if(i%2==0) 
			 {
				 System.out.print(i + " ");
			 }
		 }
	
	}

}
