package com.kn.PatternProg;

public class StarPattern {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i) 
				{
					//System.out.print("*");
					//System.out.print(i);
					//System.out.print(j);
					//System.out.print((char)(64+i));
					//System.out.print((char)(64+j));
					//System.out.print((char)(70-i));
					//System.out.print((char)(70-j));
					
				}
				else
				{
					//System.out.print("-");
				}
			}
			System.out.println(" ");
		}

	}

}
