package com.kn.stringcreation;

public class StringDemo {

	public static void main(String[] args) 
	{
		String s1="Ram";
		System.out.println("s1 = " + s1);
		String s2=new String ("Ram");
		System.out.println("S2 = " + s2);
		
		
		char[] crr= new char[5];
		crr[0]='s';
		crr[1]='h';
		crr[2]='y';
		crr[3]='a';
		crr[4]='m';
		
		
		//char[] s= {'s','h','y','a','m'};
		//System.out.println("S = " + );
		
		String s3= new String(crr);
		System.out.println("S3 = "+s3);
		

	}

}
