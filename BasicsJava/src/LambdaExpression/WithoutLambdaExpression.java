//Program to Demonstrate Lambda Expression :
package LambdaExpression;

public class WithoutLambdaExpression 
{ 
	    public static void main(String [ ] args) 
	    {  
	    	//Without Lambda 
	    	//Message Implementation Using Anonymous Class  

	    	IStatement s=new IStatement ( ) 
	        {
	        	public String show ( )
	        	{
	        		return "Welcome to Lambda Expression";
	        	}
	        };
	        	System.out.println(s.show ( ));    
	    }  
}  