//Program to Demonstrate the Multilevel Inheritance :
package MultilevelInheritance.Vehicle;

public class Maruti extends Car 
{
	public Maruti ( )
	{
		System.out.println("Class Maruti");
	}

	public void Brand ( )
	{
		System.out.println("Brand: Maruti");
	}
	
	public void Speed ( ) 
	{
		System.out.println("Max: 90Kmph");
	}
}