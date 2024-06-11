//Main Class for Bank Application :
package ImplementingInterfaces;

public class BankApplication 
{
 public static void main(String [ ] args)
 {
     // Create a Bank Instance
     Bank bank = new BankImplement ( );

     // Create an Account
     Account account = new Account(123, "Nova", 155000, bank);

     // Deposit Money
     account.deposit(2000);
     // Print the Account Details
     System.out.println(account);
     
     //Withdraw Money
     account.withdraw(10000);
     // Print the Account Details
     System.out.println(account);
 }
}
