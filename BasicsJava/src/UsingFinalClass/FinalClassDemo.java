//Program to Demonstrate Final Class :
package UsingFinalClass;
final class FinalClass 
{
	void show ( ) 
	{
		System.out.println("Final class cannot be inherited");
	}
}
//Can't Create Child Classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
class FinalChildClass extends FinalClassDemo 
{ 	}
public class FinalClassDemo 
	{
	public static void main(String [ ] args)
	{
// Create the Object of Final Class
		FinalClass f1 = new FinalClass ( ); // Call show() Method Using Object Reference  Variable ab.
		f1.show ( );
	}
}
  