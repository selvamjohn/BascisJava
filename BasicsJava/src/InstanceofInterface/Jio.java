//Program to Define Concrete Class that Implements the Phone Interface :
package InstanceofInterface;
public class Jio implements Phone
{
	@Override
	public void call ( ) 
	{
		System.out.println("Calling using Jio");
	}
	@Override
	public void sms ( ) 
	{
		System.out.println("Messaging using Jio");
	}
}