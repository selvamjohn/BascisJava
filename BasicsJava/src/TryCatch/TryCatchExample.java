//Program to Demonstrate Try Catch Block :
package TryCatch;

public class TryCatchExample
{
	static int performDivision(int x, int y)
	{
		System.out.println("I am in Method");
		int z = 0;
		try 
		{
			System.out.println("I am in Try Block");
			z = x / y;
		} 
		catch (ArithmeticException e)
		{
			System.out.println("I am in Catch Block: " + e.getMessage ( ));
		}
		return z;
	}
	static float performDivision(float a, float b)
	{
		return a/b;
	}
}