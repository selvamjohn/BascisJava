//Program to Demonstrate Accessing Classes and Methods :
package FirstPackage;
public class Executor 
		{
	public static void main(String [ ] args)
		{
//Accessing same Package Class
		Base b1=new Base( );
		b1.MethodDefault( );
		b1.MethodProtected( );
		b1.MethodPublic( );
		
		b1.varDefault=12;
		b1.MethodDefault( );
		
		//Private member cannot be accessible
		//b1.varPrivate=18; 
	    //b1.methodPrivate ( );
		
		b1.varProtected=16;
		b1.MethodProtected ( );
		
		b1.varPublic=22;
		b1.MethodPublic ( );
		
	//Instance of Operator
		System.out.println(b1 instanceof Base);
		//Returns True
		//Person p=new Person ( ); System.out.println(p instanceof Base);
		//CTE
	    //Incompatible types
		 }
}