package week3.day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		//Declare input String
		String input = "madam";
		
		//Declare output string
		String output = "";
		
		//Iterate over the input string characters in reverse order
		for(int i=input.length()-1; i>=0;i--)
		{
			//add each character into the output string
			output = output + input.charAt(i);
		}
		
		//Print the input string and reversed string
		if(input.equals(output))
			System.out.println("The given string is a palindrome");
		else
			System.out.println("The given string is not a palindrome");
	}

}
