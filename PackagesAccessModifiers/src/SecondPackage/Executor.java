//Program to Demonstrate Accessing Classes and Methods of Different Packages :
package SecondPackage;
import FirstPackage.Base;
public class Executor
	{
	public static void main(String [ ] args)
		{
		//Accessing Different Package Class
		Base b1 = new Base ( );
		// Private, Default and Protected Members cannot be access
	
		 //b1.varPrivate=18; b1.methodPrivate ( ); b1.varDefault=12; b1.methodDefault ( );
		 //b1.varProtected=16; b1.methodProtected ( );
	
		b1.MethodPublic ( );
		b1.varPublic = 22;
		b1.MethodPublic ( );
		}
	}
