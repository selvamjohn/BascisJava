//Multiple Inheritance : 
package ExtendingInterfaces;
public class ExtendingInterfaceDemo implements ChildInterface
{
	// Override Child Interface Method
	public void print ( ) 
	{ 
		System.out.println("print method");
	}
	// Override InterfaceOne method
	public void show ( )
	{
		System.out.println("show Method");
	}
}