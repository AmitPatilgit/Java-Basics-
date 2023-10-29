package com.kn.PatternProg;

public class ReverseALphaPattern {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print((char)(64+j));
			}
			System.out.println(" ");
		}

	}

}
