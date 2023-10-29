package com.kn.stringcreation;

public class StringMethod2 {

	public static void main(String[] args) {
		String s1= "Raja Ram Mohan Roy";
		System.out.println("To Convert String data in Upper Case ");
		System.out.println(s1.toUpperCase());
		System.out.println("To Convert String data in Lower Case ");
		System.out.println(s1.toLowerCase());
		System.out.println("Returns the Character at Specified Index ");
		System.out.println(s1.charAt(6));
		System.out.println("Returns the index value of the First Occurance of Specified Character ");
		System.out.println(s1.indexOf('a'));
		System.out.println("Returns the index value of the Last Occurance of Specified Character ");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println("Returns the String Starting form Specified index to the last index ");
		System.out.println(s1.substring(5));
		System.out.println("Returns the String Starting form Begning index(inclusive) till the last index(exclusive) ");
		System.out.println(s1.substring(9,14));
		System.out.println("Returns true if sepecified string found else return false  ");
		System.out.println(s1.contains("Rama"));
		System.out.println("Returns the Length of the Specified String ");
		System.out.println(s1.length());
		System.out.println("Return true if given String Starts with Specified String ");
		System.out.println(s1.startsWith("Ra"));
		System.out.println("Return true if given String  ends with Specified String");
		System.out.println(s1.endsWith("oy"));
		System.out.println("..Returns Sequence of Characters as an Array ");
		
		 
		System.out.println();
		System.out.println();
		System.out.println("******************");
		char[]  crr = s1.toCharArray();
		System.out.println(s1.length());
		System.out.println(crr.length);
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("******************");
		
		
		
		
		System.out.println("Returns Array of String splited using specified Regularexperssion((regex)(Delimiters))");
		String[] srr = s1.split(" ");//it takes the delimiter as input which means on what basis you want split
		/* Return type of split method is a Array of Strings  */
		for(int i=0;i<srr.length;i++)
		{
			System.out.print(i+"=" +srr[i]);
		}
		System.out.println();
		System.out.println("*****************************");
		System.out.println("Revrse Traversing");
		for(int i=srr.length-1;i>=0;i--)
		{
			System.out.print(srr[i]+" ");
		}
		
		
		
		String s2="  Raja Ram Mohan Roy  ";
		System.out.println();
		System.out.println();
		System.out.println("*******************************");
		System.out.println(s2);
		System.out.println(s2.trim());
		
		
		System.out.println();
		System.out.println();
		System.out.println("*************************");
		
		System.out.println();
		System.out.println("Replace the Sequence of Old Character to Sequence of New character ");
		System.out.println(s1.replace("Ra", "Sa"));
		System.out.println("");
		System.out.println(s1.replace('R', 'S'));
		
		
		
		
		String s3=" Jai Shree Ram";
		System.out.println();
		System.out.println("********************");
		System.out.println(s1.replaceAll(s1, s3));
		
		
		
		
	}

}
