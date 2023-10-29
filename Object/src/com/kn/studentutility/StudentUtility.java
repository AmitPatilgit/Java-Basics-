package com.kn.studentutility;


public class StudentUtility 
{

	


	public void SearchByid(Student[] srr, int searchID) 
	{
		int low=0,high=srr.length-1;
		
		boolean isFound=false;
		int mid=0;
		while(low<=high)
		{
			
			mid=(low+high)/2;
			if(searchID==srr[mid].id)
			{
				isFound=true;
				break;
				
			}
			
			else if(searchID>srr[mid].id)
			{
				low=mid+1;
				
			}
			else 
			{
				high=mid-1;
				
			}
			
		}
		if(isFound)
		{
			System.out.println("Id = " +srr[mid].id + " , Name =" +srr[mid].name + " , Marks = "+srr[mid].marks);
		}
		else
		{
			System.out.println("Id "+ searchID + " not found");
		}
		
	}

	
	//Method to search by name
	public void searchByName(Student[] srr, String searchName)
	{
		for(int i=0;i<srr.length;i++) {
		if(srr[i].name.equalsIgnoreCase(searchName))
			{
			 System.out.println("ID = "+srr[i].id + " , Name = "+ srr[i].name + " , Marks = " + srr[i].marks );
			}
		
		}
		
			System.out.println("The given Name " + searchName  +" is Not Present");
		
	}

	//Method to Sort Student based on marks
	public void sortBymarks(Student[] srr)
	{
		for(int i=0;i<srr.length;i++)
		{
			boolean isSwap=false;
			for(int j=0;j<srr.length-1-i;j++)
			{
				if(srr[j].marks>srr[j+1].marks)
				{
					Student temp =srr[j];
					srr[j]=srr[j+1];
					srr[j+1]=temp;
					isSwap=true;
				}
			}
			if(isSwap==false)
			{
				break;
			}
		}
		
	}

	//Method for Apply grace marks for the student who failed
	public void applyGrace(Student[] srr) 
	{
		for(int i=0;i<srr.length;i++) 
		{
		if(srr[i].marks<35)
			
		{
			int num = 35-srr[i].marks;
			System.out.println("Name = " +srr[i].name);
			System.out.println("Existing Marks = " + srr[i].marks);
			System.out.println("--------------------After Garce----------------------- ");
			System.out.println("Upgraded Marks = " +( srr[i].marks +num ));
			
		}
		}
	}


	public void rateApp( int rate) 
	{
		for(int i=0;i<rate;i++)
		{
			System.out.print("* ");
		}
		
	}


	

	 
	 
	
	

	
}
