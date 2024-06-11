//Program to Define User Defined Exception Class :

package Exception;

public class InvalidMarksException extends Exception
{
	public InvalidMarksException ( )
	{
		super ( );
	}
	public InvalidMarksException(String message)
	{
		super(message);
	}
}