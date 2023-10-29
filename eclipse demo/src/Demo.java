import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  number : ");
		int n= scan.nextInt();
		boolean res=isLeapYear(n);
		//isFibonacci(n);
		//checkPrime(n);
		//isPallindrome(n);
		//isArmstrong(n);
//		boolean res=isPrime(n);//Boolean method to find prime number
//		if(res)
//		{
//			System.out.println(n+" is a Prime Number ");
//		}
//		else
//		{
//			System.out.println(n+" is Not a Prime Number ");
//		}
		if(res)
		{
			System.out.println("The given year "+n+" is Leap Year ");
		}
		else
		{
			System.out.println("The given year " + n +" is Not a  Leap Year ");
		}
		
		
		scan.close();

	}

	public static boolean isLeapYear(int n) 
	{

		boolean isLeap=false;
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{
					isLeap=true;
				}
				else
				{
					isLeap=false;
				}
				isLeap=true;
			}
			isLeap=true;
		}
		
		return isLeap;
		
	}

	
		
	

//	public static void isFibonacci(int n) {
//		
//		
//		int n1=0,n2=1;
//		System.out.print(n1+" ");
//		while(n2<n)
//		{
//			System.out.print(n2+" ");
//			int n3=n1+n2;
//			n1=n2;
//			n2=n3;
//		}
	
//		int n1=0,n2=1;
//		System.out.print(n1+" ");
//		do
//		{
//			System.out.print(n2+" ");
//			int n3=n1+n2;
//			n1=n2;
//			n2=n3;
//		}while(n2<n);
//	}
		
//		int n1=0,n2=1,n3;
//		System.out.print("The First "+ n + " Fibonacii numnbers series are " + n1+" " + n2);
//		for(int i=3;i<=n;i++)
//		{
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.print(" "+n3);
//		}
		
		
		
	//}

//	public static void checkPrime(int n) //prime number using count
//	{
//		
//		int count=0;
//		for(int i=2;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//		{
//			System.out.println("The given number " + n + " is a Prime number ");
//		}
//		else
//		{
//			System.out.println("The given number " + n + " is Not a Prime number ");
//		}
//		
//		
//		
//	}

//	public static boolean isPrime(int n) 
//	{
//		boolean prime = true;
//		if(n==0 || n==1)
//		{
//			prime=false;
//		}
//		for(int i=2;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				prime=false;
//			}
//		}
//		return prime;
//		
//		
//	}

//	public static void isArmstrong(int n) 
//	{
//		int d;int sum=0;int temp=n;
//		while(n>0) 
//		{
//			d=n%10;
//			sum=sum+(d*d*d);
//			n=n/10;
//		
//		}
//		if(sum==temp)
//		{
//			System.out.println(temp+" is a Armstorm number " +sum);
//			
//		}
//		else
//		{
//			System.out.println(temp+" is a Not a Armstorm number " );
//		}
//		
//		
//		
//	}

//	public static void isPallindrome(int n) 
//	{
//		int d;int sum=0,temp=n;
//		while(n>0)
//		{
//			d=n%10;
//			sum=sum*10+d;
//			n=n/10;
//		}
//		//System.out.println(sum);
//		if(sum==temp)
//		{
//			System.out.println(temp+" is Pallindrome");
//		}
//		else
//		{
//			System.out.println(temp+" is not a pallindrome");
//		}
//	}

}