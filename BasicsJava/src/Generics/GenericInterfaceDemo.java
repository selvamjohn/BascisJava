//Driver Program for Generic Interface :
package Generics;
public class GenericInterfaceDemo 
{
	public static void main(String [ ] args) 
	{
		Float arr [ ] = { 3.22f, 6.8f, 222.8f, 88.9f, 6.0f };
		MinMaxImpl<Float> objOne = new MinMaxImpl<Float>(arr);
		//Retrieving Minimum and Maximum Element from Float Array
		System.out.println("Minimum value is : " + objOne.min ( ));
		System.out.println("Maximum value is : " + objOne.max ( ));
		
		String arrOne [ ] = { "Parker", "Michelle", "Harry", "Nova", "Ava" };
		MinMaxImpl<String> objTwo = new MinMaxImpl<String>(arrOne);
		//Retrieving Minimum and Maximum Element from String Array
		System.out.println("Minimum value is : " + objTwo.min());
		System.out.println("Maximum value is : " + objTwo.max());
		
		Person p [ ]=new Person [ ] {new Person("Peter", "Queens"), new Person("Jones", "Woodsides"),new Person("Richards", "Arizon")};
		MinMaxImpl<Person> objThree = new MinMaxImpl<Person>(p);
		//Retrieving Minimum and Maximum Element from Array of Person Objects
		System.out.println("Minimum value is : " + objThree.min ( ));
		System.out.println("Maximum value is : " + objThree.max ( ));
	}
}