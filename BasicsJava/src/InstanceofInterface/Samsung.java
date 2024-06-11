//Program to Define Concrete Class that Implements the Phone Interface :
package InstanceofInterface;
public class Samsung implements Phone
{
	@Override
	public void call ( ) 
	{
		System.out.println("Calling using Samsung");
	}
	@Override
	public void sms ( )
	{
		System.out.println("Messaging using Samsung");
	}
}