//Program to Define Class with Array Operations :
package Array;

public class ArrayOperations
{
	//Print Integer Array
	static void printArray(int [ ] arr) 
	{
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println ( );
	}
	
	// Variable Argument Function
	public static int getSum(int... n)
	{
		int sum = 0;
		for (int no : n)
			sum += no;
		return sum;
	}
	
	//Count Number of Odd Elements
	public static int getOddCount(int b [ ])
	{
		int count=0;
		for (int i = 0; i < b.length; i++) 
		{
			if (b[i] % 2 != 0)
				count++;		
		}
		return count;
	}
	
	//Count Number of Even Elements
	public static int getEvenCount(int b [ ])
	{
		return b.length-getOddCount(b);
	}
}