package com.kn.SwitchCase;

import java.util.Scanner;

public class WeekDayManagement {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Daynumber ");
		int daynum = scan.nextInt();
		isWeekday(daynum);
		scan.close();

	}

	 static void isWeekday(int daynum) 
	 {
		switch(daynum)
		{
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
		}
		
	 }

}


//output:-

/*

Enter the Daynumber 
5
Friday


Enter the Daynumber 
1
Monday

*/