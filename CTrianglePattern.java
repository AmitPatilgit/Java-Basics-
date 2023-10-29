package com.kn.PatternProg;

public class CTrianglePattern {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=(6-i) && j<=(4+i))
				{
					System.out.print( "*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println("-------------------------");

		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j<=(6-i) || j>=(4+i))
				{
					System.out.print( "*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println("-------------------------");
		
		
		
		int k = 0;
		for(int i=1;i<=5;i++)
		{	k=1;
			for(int j=1;j<=9;j++)
			{	
				
				if(j>=(6-i) && j<=(4+i) && k==1)
				{
					System.out.print("* ");
					k=0;
				}
				else
				{
					System.out.print("  ");
					k=1;
				}
			}
			System.out.println(" ");
		}
		System.out.println("-----------------------------");
		
		
		 k=0;
		for(int i=1;i<=7;i++)
		{	
			if(i<=4)
			{
				k++;
			}
			else 
			{
				k--;
			}
		
		
			for(int j=1;j<=7;j++)
			{	
				
				if(j>=(5-k) && j<=(3+k))
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
		System.out.println("-----------------------------");
		
		
		 	k=0;
			for(int i=1;i<=9;i++)
			{	
				if(i<=5)
				{
					k++;
				}
				else 
				{
					k--;
				}
			
			
				for(int j=1;j<=5;j++)
				{	
					
					if(j<=k)
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
			System.out.println("-----------------------------");

		
			for(int i=1;i<=5;i++)
			{		
				for(int j=1;j<=5;j++)
				{
					if((j==i) || (j+i==6))
					{
						System.out.print( "*");
						
					}
					else
					{
						System.out.print(" ");
						
					}
				}
				System.out.println(" ");
			}
			System.out.println("-------------------------");
			
			 k=0;
			for(int i=1;i<=9;i++)
			{
				if(i<=5)
				{
					k++;
				}
				else
				{
					k--;
				}
				for(int j=1;j<=9;j++)
				{
					if(j+k==6 || j-k==4)
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
			System.out.println("-------------------------");
			
			
			
			 k=0;
				for(int i=1;i<=9;i++)
				{
					if(i<=5)
					{
						k++;
					}
					else
					{
						k--;
					}
					for(int j=1;j<=9;j++)
					{
						if( j<=k || j+k>=10 )
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println("");
				}
				System.out.println("-------------------------");
		
				k=0;
				for(int i=1;i<=9;i++)
				{
					if(i<=5)
					{
						k++;
					}
					else
					{
						k--;
					}
					for(int j=1;j<=9;j++)
					{
						if( j>=k && j+k<=10 )
						{
							System.out.print("* ");
						}
						else
						{
							System.out.print("  ");
						}
					}
					System.out.println(" ");
				}
				System.out.println("-------------------------");
				
//				 k=0;
//				for(int i=1;i<=5;i++)
//				{	k=1;
//					for(int j=1;j<=5;j++)
//					
//					{
//						if(j<=i && k==1 )
//						{
//							System.out.print("1");
//							k=0;
//						}
//						else
//						{
//							System.out.print(" ");
//							k=1;
//						}
//					}
//					System.out.println(" ");
//				}
//				System.out.println("--------------------------------");
				
				
				k=0;
				for(int i=1;i<=5;i++) {
					 k=i%2;
					for(int j=1;j<=5;j++) {
						    if(i+j>=6) {
							System.out.print(k+" ");
							k=1-k;
						    }

						
					}System.out.println("");
				}
				System.out.println("------------------------------------");
	}

}
