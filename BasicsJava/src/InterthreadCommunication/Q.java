//Service Class : It is a Collection of Methods
package InterthreadCommunication;

public class Q // Q Class Refers to Service Class
{
	int n;
	boolean valueSet = false;

	public synchronized void put(int n) 
	{
		if (valueSet) 
		{
			try 
			{
				wait ( );
			} 
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put : " + n);
		notify ( );
	}
	
	public synchronized void get ( )
	{
		if (!valueSet)
		{
			try
			{
				wait ( );
			} 
			catch (Exception e)  
			{
				System.out.println(e);
			}
		}
		System.out.println("Getting data " + n);
		valueSet = false;
		notify ( );
	}
}