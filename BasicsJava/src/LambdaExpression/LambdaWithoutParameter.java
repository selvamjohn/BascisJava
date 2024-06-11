//Program to Demonstrate Lambda Expression without Parameters :
package LambdaExpression;
public class LambdaWithoutParameter 
{
	public static void main(String [ ] args) 
	{	
		IStatement s = ( ) -> {return "Hello World!!";};
		System.out.println(s.show ( ));
	}
}