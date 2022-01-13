package week3.day2;

public class CharOccurance {

	public static void main(String[] args) 
	{
		//Declare input string
		String inputString = "welcome to chennai";
		
		// Convert to charArray
		char[] charArray = inputString.toCharArray();
		
		int count = 0;
		
		// Iterate over the character array
		for (int i = 0; i < charArray.length; i++) 
		{
			//check for the character and increment the count
			if('e' == charArray[i])
				count++;
		}
		
		//print the count
		System.out.println("Number of occurances of 'e' in the given string is "+count);
	}

}
