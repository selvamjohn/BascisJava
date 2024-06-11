//Program to Demonstrate Unchecked Exception :
package UncheckedException;

//Unchecked Exceptions are Runtime Exception
public class UncheckedException
{
	public static void main(String [ ] args)
	{
		int x [ ];
		try 
		{
			x = new int [ ] { 1, 2, 3, 4 };
			System.out.println(x[3]);// Out of bound if we Enter above the index Number That is (0,1,2,3)
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.err.println("Specified index does not exist. " + e.getMessage());// to get the detail message of exception as a string value.
		}
	}
}
