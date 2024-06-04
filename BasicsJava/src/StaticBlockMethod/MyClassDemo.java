//Program to Demonstrate Static Method :
package StaticBlockMethod;
public class MyClassDemo 
{
	public static void main(String [ ] args)
		{
		MyClass o1 = new MyClass ( );
		System.out.println(o1);
		// Static Method with Class Name
		MyClass.display ( );
		MyClass o2 = new MyClass ( );
		System.out.println(o2);
		MyClass.display ( );
		MyClass o3 = new MyClass ( );
		System.out.println(o3);
		MyClass.display ( );
	}
}
