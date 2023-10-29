package com.kn.SwitchCase;

import java.util.Scanner;

public class TrafficSignalRules {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the color  ");
		String color = scan.next();
		colorSignal(color);
		scan.close();
	}

	 static void colorSignal(String color) 
	 {
		switch(color)
		{
		case "Red" :
						System.out.println("STOP");
						break;
		case "Yellow" :
						System.out.println("READY");
						break;
		case "Green" :
						System.out.println("Go");
		}
		
	 }
}




//output:-
/*

Enter the color  
Red
STOP

Enter the color  
Yellow
READY

Enter the color  
Green
Go






*/