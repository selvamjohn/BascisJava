//Program to Demonstrate Types of Functional Interfaces : 
package LambdaExpression;

import java.util.function.BiFunction; 
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display 
{
	static void show(String s) 
	{
		System.out.println("****" + s + "*********");
	}
	void show1(String s)
	{
		System.out.println("****" + s + "*********");
	}
	String getName ( )
	{
		return "TNSIF";
	}
}

public class UsingFunctionalInterfaces
{
	public static void main(String [ ] args)
	{
		// Consumer Functional Interface
		Consumer<String> consumer = (str) -> System.out.println("Welcome " + str);
		consumer.accept("Parker");		

		// Method Reference - Instance Inbuilt Method
		consumer = System.out::println; 
		consumer.accept("Michelle");
		
		// Method Reference - Static Method
		consumer = Display::show; 
		consumer.accept("Java Programming");
		
		// Method Reference - Instance Method 
		consumer = new Display ( )::show1; 
		consumer.accept("Hello");
		
		//Supplier  Functional Interface
		Supplier<String> supplier = ( ) -> "Hello from Supplier!";
		System.out.println(supplier.get ( ));

		//Constructor Reference
		Supplier<Display> displaySupplier =  Display::new;  
		System.out.println(displaySupplier.get ( ).getName ( ));

		// Positive/Negative Number Test
		Predicate<Integer> predicate = num -> num > 0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-20));

		// Max Test
		BiFunction<Integer, Integer, Integer> maxFunction = (x, y) -> x > y ? x : y;
		System.out.println(maxFunction.apply(25, 14));

		BiFunction<String, Integer, String> printFunction = (name, num) -> name + num;
		System.out.println(printFunction.apply("Good Evening", 2));
	}
}