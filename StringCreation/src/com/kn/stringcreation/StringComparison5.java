package com.kn.stringcreation;

public class StringComparison5 {

	public static void main(String[] args) {
		
		String s1="Ram";
		//String s2="Sita";
		//String s3=s1+"Sita";
		//String s4= s1+"Sita";
		
		String s5=s1;
		
		if(s5==s1) //Reference Comparison
		{
			System.out.println("Refrence Are pointing to the same Object ");
		}
		else
		{
			System.out.println("Refrence Are pointing to the different Object ");
		}
		
		
		if(s5.equals(s1)) //StringData Comparison
		{
			System.out.println("String Data in the Object are Equal  ");
		}
		else
		{
			System.out.println("String Data in the Object are UnEqual ");
		}

	}

}
