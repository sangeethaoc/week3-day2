package week3.day2;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)
		String[] compNamesArr = new String[] { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// Sort the given list in ascending order
		Collections.sort(Arrays.asList(compNamesArr));

		// Reverse the order of elements in the sorted list
		Collections.reverse(Arrays.asList(compNamesArr));

		for (String string : compNamesArr) {
			System.out.print(string + " ");
		}
	}

}
