//Program to Demonstrate Abstraction :
package Abstraction;
public class AbstractDemo
{
	public static void main(String [ ] args)
	{
		Square sq=new Square ( );
		Rectangle r1=new Rectangle ( );
		sq.calArea ( );
		sq.show ( );
		r1.calArea ( );
		r1.show ( );
		System.out.println("-----");
//Runtime Polymorphism / Dynamic Binding / Late Binding
//Ex: Method Overriding
		
		Shape shape;
		shape=new Square(12.5f);
		
		shape.calArea ( ); // Invoked Square class calArea ( )
		shape.show ( );
		
		shape=new Rectangle(10,20);
		
		shape.calArea ( ); // invoked Rectangle class calArea()
		shape.show ( );
		}
}
