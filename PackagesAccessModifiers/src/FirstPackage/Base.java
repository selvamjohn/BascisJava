//Program to Demonstrate Package and Access Modifiers :
package FirstPackage;
public class Base 
	{
	//  Declaring Default, Public, Private and Protected variables 
	 
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	// Declaring methods with Default, Public, Private, Protected types

	void MethodDefault ( )
	{
		System.out.println("Default access Base class");
		System.out.println("Default Variable : "+varDefault);
	}
	
	public void MethodPublic ( )
	{
		System.out.println("Public access Base class");
		System.out.println("Public Variable : "+varPublic);
	}
	
	private void MethodPrivate ( )
	{
		System.out.println("Private access Base class");
		System.out.println("Private Variable : "+varPrivate);
	}
	
	protected void MethodProtected ( )
	{
		System.out.println("Protected access Base class");
		System.out.println("Protected Variable : "+varProtected);
	}
}