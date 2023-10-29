package com.kn.SwitchCase;

import java.util.Scanner;

public class GameOfCoin {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Gold coin : ");
		int goldCoins = scan.nextInt();
		System.out.print("Enter the player level : ");
		int playerLevel = scan.nextInt();
		boolean hasSpecialKey = true;
		scan.close();
		
		checkSpecialItem(goldCoins, playerLevel, hasSpecialKey);
		

	}

	 static void checkSpecialItem(int goldCoins, int playerLevel, boolean hasSpecialKey) 
	{
		 switch (goldCoins) 
		 {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
             System.out.println("You need more than 10 gold coins to find the special item.");
             break;

         default:
             if (playerLevel > 5) {
                 if (hasSpecialKey) {
                     System.out.println("Special Item Found");
                 } else {
                     System.out.println("You need a special key to find the special item.");
                 }
             } else {
                 System.out.println("Your level needs to be above 5 to find the special item.");
             }
             break;
     }
		
		
	}

	 

}
