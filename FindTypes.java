package week3.day2;

public class FindTypes {

	public static void main(String[] args) 
	{
		// Declare the input
		String inputString = "$$ Welcome to 2nd Class of Automation $$ ";

		// Convert to charArray
		char[] charArray = inputString.toCharArray();

		// Declare the count variables
		int letter = 0, space = 0, num = 0, specialChar = 0;

		// Iterate over the character array
		for (int i = 0; i < charArray.length; i++) 
		{
			if (Character.isLetter(charArray[i]))
				letter++;
			else if (Character.isDigit(charArray[i]))
				num++;
			else if (Character.isSpaceChar(charArray[i]))
				space++;
			else
				specialChar++;
		}
		
		// Print the count here
		System.out.println("Input String Length : "+inputString.length());
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		System.out.println("Output Character Types Length : "+(letter+space+num+specialChar));
		
	}

}
