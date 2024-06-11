//Program to Demonstrate Array of Student Objects :
package Array;

public class ArrayOfObjectsDemo 
{
	public static void main(String [ ] args) 
	{
		// Declares an Array of Integers.
		Student [ ] arr;
		// Allocating Memory for 5 Objects of type Student.
		arr = new Student[5];
		// Initialize the First Elements of the Array
		arr[0] = new Student(1, "Parker");
		// Initialize the Second Elements of the Array
		arr[1] = new Student(2, "Michelle");
		// so on...
		arr[2] = new Student(3, "Harry");
		arr[3] = new Student(4, "Nova");
		arr[4] = new Student(5, "Ava");
		
		// Accessing the Elements of the Specified Array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo ( )+ " " + arr [i].getName ( ));
	}
}