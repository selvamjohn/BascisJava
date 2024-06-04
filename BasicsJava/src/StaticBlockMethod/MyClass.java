//Program to Demonstrate Static Block :
package StaticBlockMethod;
public class MyClass
	{
	private int section ; 			//Non-Static or Instance Variable
	private static int srNo; 		//Static or Class Variable
//Static Block		
	static
	{
		System.out.println("-----Within Static Block-----");
		srNo=1000;
	}
//Default Constructor
	MyClass ( )
	{
		System.out.println("-----Within Default Constructor-----");
		srNo++;
		section++;		
	}
@Override
	public String toString ( ) 
	{
		return "MyClass [Serial No "+srNo+", Section=" + section + "]";
	}
//Static Method
	static void display ( ) 
	{
	//	System.out.println("Section : "+section); 	//cannot be access Non Static Members	
		System.out.println("Serial No. "+srNo); 
	}
}