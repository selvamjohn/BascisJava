//Program to demonstrate final method 
package UsingFinalClass;
//Class with Final Method
class FinalMethodClass
{
//Constructor
	FinalMethodClass ( ) 
	{
		System.out.println("This is a Default Constructor");
	}
	final int a = 50;
// Final Method
	final void show ( )
	{
		System.out.println("Value of a: " + a);
	}
}

