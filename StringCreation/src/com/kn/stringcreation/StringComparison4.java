package com.kn.stringcreation;

public class StringComparison4 {

	public static void main(String[] args) {
		
		
		String s1= "Ram";
		String s2="Sita";
		String s3= s1+s2;
		String s4= s1+s2;
		
		if(s3==s4) //Reference Comparison
		{
			System.out.println("Refrence Are pointing to the same Object ");
		}
		else
		{
			System.out.println("Refrence Are pointing to the different Object ");
		}
		
		
		if(s3.equals(s4)) //StringData Comparison
		{
			System.out.println("String Data in the Object are Equal  ");
		}
		else
		{
			System.out.println("String Data in the Object are UnEqual ");
		}

	}

}
