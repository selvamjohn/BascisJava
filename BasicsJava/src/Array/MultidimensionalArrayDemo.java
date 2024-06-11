//Program to Demonstrate Multidimensional Array :
package Array;

public class MultidimensionalArrayDemo 
{
	public static void main(String [ ] args)
	{

		int c [ ] [ ] = { { 12, 45 }, { 10, 40 }, { 5, 7 } }; // New Integer [3][2];

		System.out.println("No. of Rows in C array : " + c.length);

		MultidimensionalArray.printArray(c);
	}
}