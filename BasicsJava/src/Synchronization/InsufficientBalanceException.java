//Program to Demonstrate User Defined Exception Class :
package Synchronization;

public class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException ( ) 
	{
		super("Insufficient balance in your account");
	}

	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}