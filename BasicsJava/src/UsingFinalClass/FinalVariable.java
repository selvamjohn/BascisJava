// Program to Demonstrate Final Variable
package UsingFinalClass;
public class FinalVariable
{
// Final int x; // Final Instance Variable must be Initialized
	final int x = 100;
// Declare a Static Blank Final Variable.
	final static int Y;
// Declare & Initialize Static Final Variable.
	final static int Z = 10;
// Instance Method
	void change ( )
	{
	//	x = 30; // Final Variables can't be Reassigned
	//Y = 200; // Final Static Variables can't be Reassigned
	}
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}
// Declare a Static Block to Initialize the Final Static Variable.
	static 
	{
		Y = 20;
	//	Z = 100; // Once Initialized can't be Reassigned
		System.out.println("Value of Y: " + Y);
	}
}