//Program to Demonstrate Method Overriding - Runtime Polymorphism :
package Overriding;
public class OverridingDemo 
{
	public static void main(String [ ] args)
	{
		RBI rbi;
//		Dynamic Binding Assigning Child Class Object to Parent Class Reference Variable.
		rbi = new SBI ( );
		System.out.println(rbi.getRateOfInterest ( ));

		rbi = new ICICI ( );
		System.out.println(rbi.getRateOfInterest ( ));

		rbi = new HDFC ( );
		System.out.println(rbi.getRateOfInterest ( ));
	}
}