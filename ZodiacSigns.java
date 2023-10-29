package com.kn.SwitchCase;

import java.util.Scanner;

public class ZodiacSigns {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Zodiac Signs : ");
		String Zodiac =scan.next();
		isZodiacCharacteristic(Zodiac);
		scan.close();

	}

	 static void isZodiacCharacteristic(String zodiac) 
	 {
		switch(zodiac)
		{
		case "Aries" :
				System.out.println("Adventurous");
				break;
		case "Taurus" :
			  	System.out.println("Dependable");
			  	break;
		case "Gemini" :
				System.out.println("Expressive");
				break;
		case "Cancer" :
				System.out.println("Intuitive");
				break;
		case "Leo" :
				System.out.println("Passionate");
				break;
		case "Virgo" :
				System.out.println("Analytical");
				break;
		case "Libra" :
				System.out.println("Diplomatic");
				break;
		case "Scorpio" :
				System.out.println("Determined");
				break;
		case "Sagittarius" :
				System.out.println("Philosophical");
				break;
		case "Capricorn" :
				System.out.println("Organized");
				break;
		case "Aquarius" :
				System.out.println("Original");
				break;
		case "Piscess" :
				System.out.println("Compassionate");
				break;
		}
		
	}

}


//output:-

/*
Enter the Zodiac Signs
Aries
Adventurous

Enter the Zodiac Signs
Virgo
Analytical





*/