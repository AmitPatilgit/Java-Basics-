package com.kn.PatternProg;

public class Print1 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print((char)(70-i));
			}
			System.out.println(" ");
		}
		System.out.println("-------------");
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)>=6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println("-------------");
	}

}
