package com.kn.Forloop;

import java.util.Scanner;

public class KArmstromNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		armStromNumber(n);
		scan.close();
	}

	 static void armStromNumber(int n) 
	 {
		 int d=1,s,t=n;
		 for(s=0;n>0;n/=10)
		 {
			 d=n%10;
			 s=s+(d*d*d);
			 if(t==s)
			 {
			 System.out.println( t + " is a Armstrom Number" );
			 }
		 }
		 
	}

}
