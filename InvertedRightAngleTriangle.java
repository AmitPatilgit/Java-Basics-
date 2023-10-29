package com.kn.PatternProg;

public class InvertedRightAngleTriangle {

	public static void main(String[] args) 
	{//1
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=(6-i)) 
				{
					System.out.print("*");
				}
				else
				{
					
				}
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------------");
		
		//2
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=(6-i))
				{
					System.out.print(i);
				}
				else
				{
					
				}
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------------");
		
		//3
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=(6-i)) 
				{
					System.out.print(j);
				}
				else
				{
					
				}
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------------");
		
		
		
		//4
		for(int i=1;i<=5;i++) 
		{
			for(int j=5;j>=1;j--)
			{
				if(j<=(6-i)) 
				{
					System.out.print(j);
				}
				else
				{
					
				}
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------------");
		
		for(int i=5;i>=1;i--) 
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j) 
				{
					System.out.print(i);
				}
				else
				{
					
				}
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------------");
		
		for(int i=5;i>=1;i--) 
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j) 
				{
					System.out.print(j);
				}
				else
				{
					
				}
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------------");
	}

}
