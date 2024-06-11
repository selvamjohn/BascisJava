//Program to Demonstrate Arrays Class Methods :
package Array;

import java.util.Arrays;

public class ArrayClassDemo
{
	public static void main(String [ ] args)
	{
		// Get the Array
		int intArr [ ] = { 10, 20, 15, 22, 35, 18 , 14 };

		// To Print the Elements in One Line
		System.out.println("Array is : "+Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		
		System.out.println("-----After Sorting-----");
		System.out.println("Array is : "+Arrays.toString(intArr));

		int intKey = 22;

		// Print the Key and Corresponding Index
		// Array must be sorted in Ascending Order for the Binary Search
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));

		System.out.println("First Array : " + Arrays.toString(intArr));
		
		//Get the Second Array
		int intArr1 [ ] = { 10, 15, 22 };
		System.out.println("Second Array : " + Arrays.toString(intArr1));

		// To Compare both Arrays
		if (Arrays.equals(intArr, intArr1))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Arrays are not equal");

		//Creates a New Array with a Specified Length  
		System.out.println("\nNew Arrays by copyOf:\n");
		int intArr2 [ ]=Arrays.copyOf(intArr, 10);
		System.out.println("Integer Array: " + Arrays.toString(intArr2));

		System.out.println("\nNew Arrays by copyOfRange:");
		// To Copy the Array into an Array of New Length
		int intArr3 [ ]=Arrays.copyOfRange(intArr, 1, 3);
		System.out.println("Integer Array: " + Arrays.toString(intArr3));

		// To Fill the Arrays with Key 22
		Arrays.fill(intArr, intKey);
		System.out.println("Integer Array on filling 22: " + Arrays.toString(intArr));
	}
}