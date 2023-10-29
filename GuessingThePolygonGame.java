package com.kn.SwitchCase;

import java.util.Scanner;

public class GuessingThePolygonGame {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Sides : ");
		int sides= scan.nextInt();
		scan.close();
		isPolygon(sides);

	}

	 static void isPolygon(int sides)
	 {
		switch(sides)
		{
		case 3 :
				System.out.println("Triangle");
				break;
		case 4 :
				System.out.println("Quadrilateral");
				break;
		case 5 :
				System.out.println("Pentagon");
				break;
		case 6: 
				System.out.println("Hexagon");
				break;
		case 7 :
				System.out.println("Heptagon");
				break;
		case 8 :
				System.out.println("Octagon");
				break;
				
				default:
					System.out.println();
		}
		
	 }

}


//output:-

/*

Enter the Number of Sides 
4
Quadrilateral

Enter the Number of Sides 
6
Hexagon




*/