package com.kn.SwitchCase;

import java.util.Scanner;

public class GardeningShop {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Select the Type of Plant : ");
//		System.out.println("1 - Roses ");
//		System.out.println("2 - Sunflowers ");
//		System.out.println("3 - Orchids ");
//		System.out.println("4 - Cacti ");
//		System.out.println("5 - Ferns ");
		int Planttype = scan.nextInt();
		isFertilizers(Planttype);
		scan.close();

	}

	 static void isFertilizers(int planttype) 
	 {
		 switch(planttype)
			{
			case 1 :
				System.out.println("Rose Food");
				break;
			case 2 :
				System.out.println("All Purpose Fertilizer");
				break;
			case 3 :
				System.out.println("Orchid Fertilizer");
				break;
			case 4 :
				System.out.println("Cactus Mix");
				break;
			case 5 :
				System.out.println("Organic Compost");
				break;
		default:
			System.out.println();
			}
	 }
}


//output:-

/*

Select the Type of Plant 
1
Rose Food

Select the Type of Plant 
4
Cactus Mix



*/