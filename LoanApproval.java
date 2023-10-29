package com.kn.NestedIf;

import java.util.Scanner;

public class LoanApproval {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = scan.nextInt();
		System.out.println("Enter your Annual income ");
		int annualincome= scan.nextInt();
		scan.close();
		boolean loanApproval = isLoanApproval(age,annualincome);
		if(loanApproval==true)
		{
			System.out.println("Loan Approved");
		}
		

	}

	 static boolean isLoanApproval(int age,int annualincome) 
	 {
		if(age>=18) 
		{
			if(annualincome>40000) 
			{
				return true; 
			}
			else 
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

}


//output:-
/*

Enter your age 
22
Enter your Annual income 
50000
Loan Approved

Enter your age 
22
Enter your Annual income 
30000








*/