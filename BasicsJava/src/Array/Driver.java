//Program to Demonstrate Array Operations :
package Array;

//Driver Class
public class Driver 
{
	public static void main(String args [ ]) 
	{
		int n = 10;
		int a [ ]; // Declaration
		a = new int[n]; // Instantiation

		// Displaying the Array
		ArrayOperations.printArray(a);

		// Assigning Values in Array a
		for (int i = 0; i < a.length; i++)
			a[i] = 5 * i;

		ArrayOperations.printArray(a);

		int b [ ] = { 10, 20, 30, 40, 50 }; // Initialization at the Time of Declaration
		ArrayOperations.printArray(b);

		// Calling Variable Argument Function
		System.out.println("sum of array elements is : " + ArrayOperations.getSum(b));
		System.out.println("sum of array elements is : " + ArrayOperations.getSum(10, 20));

		b[2] = 999; // Assigning Single Element
		// RTE - ArrayIndexOutOfBoundsException
		// b[20]=10;
		ArrayOperations.printArray(b);

		// Display total Number of Odd and Even Numbers in Array b

		System.out.println("Odd numbers : " + ArrayOperations.getOddCount(b) + "\tEven numbers : "
		+ ArrayOperations.getEvenCount(b));
		System.out.println ( );
		System.out.println("-----");

		int c [ ];
		// ArrayOperations.printArray(c); //CTE
	
	}
}