//Program to Demonstrate Singleton Class :
package ThirdPackage;
public class MyClass
	{
	private static MyClass obj=new MyClass ( );
	private int id;
	
	public int getId ( ) 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private MyClass ( )
	{
		System.out.println("MyClass Object Created");		
	}
	
	public static MyClass getObject ( ) 		//Factory Method
	{
		return obj;
	}

	@Override
	public String toString ( ) 
		{
		return "MyClass [id=" + id + "]";
	}
}
