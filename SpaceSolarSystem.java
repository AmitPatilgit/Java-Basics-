package com.kn.SwitchCase;

import java.util.Scanner;

public class SpaceSolarSystem {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Planet name ");
		String planet= scan.next();
		isPalnetnumber(planet);
		scan.close();

	}

	 static void isPalnetnumber(String planet) 
	 {
		 switch(planet)
		 {
		 case "Sun" :
			 		System.out.println("0");
			 		break;
		 case "Mercury" :
		 			System.out.println("1");
		 			break;
		 case "Venus" :
		 			System.out.println("2");
		 			break;
		 case "Earth" :
		 			System.out.println("3");
		 			break;
		 case "Mars" :
		 			System.out.println("4");
		 			break;
		 case "Jupiter" :
		 			System.out.println("5");
		 			break;
		 case "Saturn" :
		 			System.out.println("6");
		 			break;
		 case "Uranus" :
		 			System.out.println("7");
		 			break;
		 case "Neptune" :
		 			System.out.println("8");
		 			break;
		 }
		
		
	 }

}

//output:-
/*
Enter the Planet name 
Earth
3


Enter the Planet name 
Mars
4



*/