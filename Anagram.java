package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		//Declare a String 
		 String inputString1 = "stops";
		 
	    //Declare another String
		 String inputString2 = "potss"; 
		 
		 //check if both input strings are of same length
		 if(inputString1.length() == inputString2.length())
		 {
			 System.out.println("Length of both input strings are equal");
			 
			 System.out.println("**************************************");
			 
			 //convert both the string into char array
			 char[] charArray1 = inputString1.toCharArray();
			 char[] charArray2 = inputString2.toCharArray();
			 
			 //sort both character arrays
			 Arrays.parallelSort(charArray1);
			 Arrays.parallelSort(charArray2);
			 
			 if(Arrays.equals(charArray1, charArray2))
				 System.out.println("The two input strings are anagram of each other");
			 else
				 System.out.println("The two input strings are not anagram of each other");
		 }
	}

}
