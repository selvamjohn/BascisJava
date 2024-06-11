//Program to Demonstrate Lower Bounded Wild Card Class :
package Generics;
import java.util.List;

public class LowerBoundedWildCard 
{
	//Parameter List(<?>) is List of Any Super Class Object of Integer
	public static void displayNumbers(List<? super Integer> list) // any super class of Integer class
	{
		for (Object n : list)
		{
			System.out.println(n);
		}
	}
}