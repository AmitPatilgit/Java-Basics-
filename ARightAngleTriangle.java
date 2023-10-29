package com.kn.PatternProg;

public class ARightAngleTriangle {

	public static void main(String[] args) 
	{//1
		for(int i=5;i>=1;i--)
		//for(int i=1;i<=5;i++)
		{
			//for(int j=1;j<=5;j++)
			for(int j=5;j>=1;j--)
			{
				if(i<=j)
				{
					System.out.print(j);
					//System.out.print(i);
				}
				else
				{
					
				}
			}
			System.out.println(" ");
		}
		System.out.println("-----------------------------");
		
		//2
			for(int i=5;i>=1;i--)
			//for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				//for(int j=5;j>=1;j--)
				{
					if(i<=j)
					{
						System.out.print(j);
						//System.out.print(i);
					}
					else
					{
						
					}
				}
				System.out.println(" ");
			}
			System.out.println("----------------------------");
			
			
			//3
				for(int i=5;i>=1;i--)
				//for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=5;j++)
					//for(int j=5;j>=1;j--)
					{
						if(i<=j)
						{
							//System.out.print(j);
							System.out.print(i);
						}
						else
						{
							
						}
					}
					System.out.println(" ");
				}
				System.out.println("---------------------------");
				
				
				//4
					//for(int i=5;i>=1;i--)
					for(int i=1;i<=5;i++)
					{
						for(int j=1;j<=5;j++)
						//for(int j=5;j>=1;j--)
						{
							if(i>=j)
							{
								System.out.print(j);
								//System.out.print(i);
							}
							else
							{
								
							}
						}
						System.out.println(" ");
					}
					System.out.println("--------------------------------");
					
					
					//5
						//for(int i=5;i>=1;i--)
						for(int i=1;i<=5;i++)
						{
							for(int j=1;j<=5;j++)
							//for(int j=5;j>=1;j--)
							{
								if(i>=j)
								{
									//System.out.print(j);
									System.out.print(i);
								}
								else
								{
									
								}
							}
							System.out.println(" ");
						}
						System.out.println("---------------------------------");
						
						
						//6
							//for(int i=5;i>=1;i--)
							for(int i=1;i<=5;i++)
							{
								for(int j=1;j<=5;j++)
								//for(int j=5;j>=1;j--)
								{
									if(i>=j)
									{
										System.out.print("*");
										//System.out.print(i);
									}
									else
									{
										
									}
								}
								System.out.println(" ");
							}
							System.out.println("--------------------------------");
							
								//for(int i=5;i>=1;i--)
								for(int i=1;i<=5;i++)
								{
									//for(int j=1;j<=5;j++)
									for(int j=5;j>=1;j--)
									{
										if(i>=j)
										{
											System.out.print(j);
											//System.out.print(i);
										}
										else
										{
											
										}
									}
									System.out.println(" ");
								}
								System.out.println("-------------------------------");
								
									//for(int i=5;i>=1;i--)
									for(int i=1;i<=5;i++)
									{
										//for(int j=1;j<=5;j++)
										for(int j=5;j>=1;j--)
										{
											if(i>=j)
											{
												//System.out.print(j);
												System.out.print(i);
											}
											else
											{
												
											}
										}
										System.out.println(" ");
									}
								System.out.println("-------------------------------");
								
								
									//for(int i=5;i>=1;i--)
									for(int i=1;i<=5;i++)
									{
										for(int j=1;j<=5;j++)
										//for(int j=5;j>=1;j--)
										{
											if(i>=j)
											{
												//System.out.print(j);
												System.out.print((char)(i+64));
											}
											else
											{
												
											}
										}
										System.out.println(" ");
									}
								System.out.println("--------------------------------");
								
								
								
								for(int i=1;i<=5;i++)
								{
									for(int j=1;j<=5;j++)
									//for(int j=5;j>=1;j--)
									{
										if(i>=j)
										{
											System.out.print((char)(j+64));
											//System.out.print((char)(i+64));
										}
										else
										{
											
										}
									}
									System.out.println(" ");
								}
							System.out.println("-------------------------------------");
							
							
							for(int i=1;i<=5;i++)
							{
								for(int j=1;j<=5;j++)
								//for(int j=5;j>=1;j--)
								{
									if(i>=j)
									{
										//System.out.print(j);
										System.out.print((char)(70-i));
									}
									else
									{
										
									}
								}
								System.out.println(" ");
							}
							System.out.println("---------------------------------------");
						
							
							for(int i=1;i<=5;i++)
							{
								for(int j=1;j<=5;j++)
								//for(int j=5;j>=1;j--)
								{
									if(i>=j)
									{
										//System.out.print(j);
										System.out.print((char)(70-j));
									}
									else
									{
										
									}
								}
								System.out.println(" ");
							}
						System.out.println("-------------------------------------------");
						
						
						
	}

}
