package com.kn.WhileLoop;

import java.util.Scanner;

public class LargestNumberLessThanPallindrome 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number as a range :");
		int range = scan.nextInt();
		isLargestPallindrome(range);
		scan.close();

	}

	 static void isLargestPallindrome(int range) 
	 {
		 int i=range;
		 while(i>=1)
		 {
			 if(isPallindrome(i))
			 {
				 System.out.println("The Largest Pallindrome number in the range of " + range + " in the given " + i );
				 break;
			 }
			 i--;
		 }
			
	}
	 static boolean isPallindrome(int n)
	 {
		 int d=0,sum=0,temp=n;
		 while(n>0)
		 {
			 d=n%10;
			 sum=sum*10+d;
			 n=n/10;
		 }
		 if(temp==sum)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 

}
