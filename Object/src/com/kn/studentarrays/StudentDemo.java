package com.kn.studentarrays;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Amit",83);
		Student s2=new Student(2,"Akash",90);
		Student s3=new Student(3,"Ankur",30);
		
		Student [] srr= new Student[3];
		
		srr[0]=s1;
		srr[1]=s2;
		srr[2]=s3;
		
		
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
		for(int i=0;i<srr.length;i++)
		{
			System.out.println(" \n ID = "+srr[i].id + " \n Name = "+ srr[i].name + " \n Marks = " + srr[i].marks );
		}
			
//			if(srr[i].marks<35)
//				
//			{
//				int num = 35-srr[i].marks;
//				System.out.println("Name = " +srr[i].name);
//				System.out.println("Existing Marks = " +srr[i].marks);
//				System.out.println("--------------------After Garce----------------------- ");
//				// srr[i].marks=35;
//				System.out.println("Upgraded Marks = " +( srr[i].marks +num ));
//				
//				
//			}
//			if(srr[i].name.equalsIgnoreCase("ankur"))
//			{
//			 System.out.println("ID = "+srr[i].id + " , Name = "+ srr[i].name + " , Marks = " + srr[i].marks );
//			}
		

	}

}
