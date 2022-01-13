package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestUsingCollection {

	public static void main(String[] args) 
	{
				// Declare the input array list
				List<Integer> inputArrayList = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));

				//Arrange the inputArrayList in ascending order
				Collections.sort(inputArrayList);
				
				//Pick the 2nd element from the last and print it
				System.out.println("The second largest number : " +inputArrayList.get(new Integer(inputArrayList.size() -2)));
	}
}
