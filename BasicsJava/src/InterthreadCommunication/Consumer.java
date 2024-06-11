//Program to Demonstrate InterThread Communication - Consumer Thread Class :

package InterthreadCommunication;

public class Consumer extends Thread 

{
	Q obj; 
	public Consumer(Q obj) 
	{
		this.obj = obj;
		start ( );
	}
	public void run ( ) 
	{
			
		while (true)
			{
			try 
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			obj.get ( );
		}
	}
}