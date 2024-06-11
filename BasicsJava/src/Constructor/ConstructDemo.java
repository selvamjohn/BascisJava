package Constructor;

public class ConstructDemo
		{
	public static void main(String[] args)
		{
		//Object for default Constructor:
		Construct c = new Construct ( );
		System.out.println(c);
		
		//Object for parameterized Constructor:
		Construct c1 = new Construct ("Nova",22);
		System.out.println(c1);
		
		//Object for Overloaded Constructor:
		Construct c2 = new Construct ("Nova",22,23);
		System.out.println(c2);
	}
}
