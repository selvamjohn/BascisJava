//Program to Demonstrate Thread Synchronization :
package Synchronization;		//It Execute the next task only after the completion of the 1st task and then it move to the 2nd.

public class SynchronizationDemo 
{

	public static void main(String [ ] args) 
	{

		Account acc = new Account(101, "Parker", 50000);
		System.out.println(acc);

		// Five account threads running parallel and sharing same resource
		AccountThread thread [ ] = new AccountThread[5];
		for (int i = 0; i < 5; i++) 
		{
			thread[i] = new AccountThread(acc, 1000 * (i + 1));
			try
			{
				thread[i].join ( ); 	// Waits main Thread till Execution of all Child Thread Finish
			}
			catch (InterruptedException e) 
			{
				System.out.println(e.getMessage ( ));
			}
		}
		System.out.println("-----");
		System.out.println(acc);
	}
}