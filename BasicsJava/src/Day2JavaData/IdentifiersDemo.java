package Day2JavaData;

public class IdentifiersDemo {

	public static void main(String[] args) 
	{
	     // Variable declaration - Invalid Identifier Examples
		
 		/*		int for = 13; // error because keyword cannot be identifier system.out.println ("value  of the number variable is : "+ for); */ 
 		/*		int number 2 = 13; // error because do not add space within  identifier system.out.println("value  of the number variable is : "+ number 2); */ 
		// error because Identifier can not starts with @,#
		// int @number3=10;
		
		//Valid Identifier Examples
		
		int $number = 5; //starts with $ dollar symbol
		System.out.println("value of the number variable is : "+ $number);
		
		String studentName="Parker";  //use Camelcase instead of using underscore and space between the name
		System.out.println("value  is : "+ studentName);
		
	}

}
