package com.kn.Forloop;

import java.util.Scanner;

public class HgivenNumberIsPalindromeOrNot {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = scan.nextInt(); //  The number you want to check
        scan.close();
		if (isPalindrome(number)==true) 
        {
            System.out.println(number + " is a palindrome.");
        } else 
        {
            System.out.println(number + " is not a palindrome.");
        }

	}

	 static boolean isPalindrome(int number) 
	 {
		 int originalNumber = number;
	        int reversedNumber = 0;

	        // Calculate the reversed number using a for loop
	        for (int temp = number; temp != 0; temp /= 10) {
	            int digit = temp % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	        }

	        // Check if the reversed number is equal to the original number
	        return originalNumber == reversedNumber;
	}

}
