package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharsUsingCollection {

	// Input: "PayPal India"
	// Output:PaylIndi

	public static void main(String[] args) {

		// Declare a String as PayPal India
		String input = "PayPal India";

		// Convert it into a character array
		char charArray[] = input.toCharArray();

		// Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();

		// Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		// Iterate character array and add it into charSet
		for (int i = 0; i < charArray.length; i++) 
		{
			// Check the iterator variable isn't equals to an empty space
			if (charArray[i] != ' ')
			{
				if(!charSet.add(charArray[i]))
					// if the character is already in the charSet then, add it to the dupCharSet
					dupCharSet.add(charArray[i]);
			}
		}

		// Print charSet and dupCharSet
		System.out.println(charSet);
		System.out.println(dupCharSet);
	}

}
