package com.kn.stringcreation;

public class StringComparission1 {

	public static void main(String[] args) 
	{
		String s1= "Ram";
		String s2="Ram";
		String s3=new String ("Sita");
		String s4= new String ("Sita");
		
		if(s1==s2) //Reference Comparison
		{
			System.out.println("Refrence Are pointing to the same Object ");
		}
		else
		{
			System.out.println("Refrence Are pointing to the different Object ");
		}
		
		
		if(s1.equals(s2)) //StringData Comparison
		{
			System.out.println("String Data in the Object are Equal  ");
		}
		else
		{
			System.out.println("String Data in the Object are UnEqual ");
		}
		
		
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
