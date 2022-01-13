package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		//Declare input string
		String inputString = "I am a software tester";
		
		//Split the string into string array
		String[] inputStringArray = inputString.split(" ");
		
		//Declare evenString
		String evenString = "";
		
		//Declare evenStringReverse 
		String evenStringReverse = "";
		
		//Declare outputString
		String outputString = "";
		
		//Iterate over the input string
		for(int i=0; i<inputStringArray.length; i++)
		{
			//Find the even string
			if(i%2 == 1)
			{
				evenString = inputStringArray[i];
				
				//Iterate over the even string characters in reverse order
				for(int j=evenString.length()-1; j>=0;j--)
				{
					//add each character into the output string
					evenStringReverse = evenStringReverse + evenString.charAt(j);
				}
				//Assign the reversed even string back to the inputStringArray
				inputStringArray[i] = evenStringReverse;
				
				evenStringReverse = "";
			}
		}
		
		//Join the array elements in output string
		outputString = String.join(" ", inputStringArray);
		
		//Print the output string
		System.out.println("Reversed Even String Output : " + outputString);
	}

}
