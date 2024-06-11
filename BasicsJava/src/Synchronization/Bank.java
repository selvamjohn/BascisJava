//Program to Demonstrate Bank Interface :
package Synchronization;

public interface Bank 
{
	int MINBAL=5000; 		//Fields are Static and Final
	static final int DAILY_LIMIT=25000;
	public abstract void deposit(int amt) throws DepositLimitExceedsException;
	void withdraw(int amt)throws InsufficientBalanceException; 		//Public and Abstract
}