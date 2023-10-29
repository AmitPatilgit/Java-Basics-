package com.kn.SwitchCase;

import java.util.Scanner;

public class BookGeners {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Genres number : ");
		int genres = scan.nextInt();
		isGenres(genres);
		scan.close();
				

	}

	private static void isGenres(int genres) 
	{
		switch(genres)
		{
		case 1 :
			System.out.println("Friction");
			break;
		case 2 :
			System.out.println("Non-Friction");
			break;
		case 3 :
			System.out.println("Fantasy");
			break;
		case 4 :
			System.out.println("Mystery");
			break;
		case 5 :
			System.out.println("Biography");
			break;
			default:
		}
		
	}

}



//output:-

/*
Enter the Genres number 
3
Fantasy

Enter the Genres number 
5
Biography






*/