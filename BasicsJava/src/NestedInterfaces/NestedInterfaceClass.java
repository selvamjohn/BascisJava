//Child Class Implements Inner Interface :
package NestedInterfaces;
public class NestedInterfaceClass implements MyInterface.MyInnerInterface
{
	@Override
	public void print ( ) 
	{
			 System.out.println("Print method of nested interface");
	}
}