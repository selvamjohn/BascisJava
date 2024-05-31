//Program to demonstrate Private Constructor and Singleton Class :
package ThirdPackage;
public class MyClassDemo 
		{
	public static void main(String s [ ])
		{
		// We Can't Create Object with Private Constructor
		// MyClass m1=new MyClass ( );
		
		MyClass m=MyClass.getObject ( );
		m.setId(12);
		
		MyClass m1=MyClass.getObject ( );
		
		System.out.println(m);
		System.out.println(m1);
	}
}
