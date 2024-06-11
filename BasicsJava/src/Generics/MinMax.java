//Program to Demonstrate Generic Interface :
package Generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> 
{
	T min ( );

	T max ( );
}