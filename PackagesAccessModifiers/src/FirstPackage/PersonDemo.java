//Program for Creating Objects :
package FirstPackage;

import java.util.Scanner;

public class PersonDemo 
		{
	public static void main(String args [ ]) 
		{
		Person p1 = new Person ( );
		// Default Constructor invoked

		Scanner sc = new Scanner(System.in);
		String Name, City;
		int Age;
		System.out.println("Enter Person details : Name, age and city");
		Name = sc.nextLine ( );
		Age = sc.nextInt ( );
		City = sc.nextLine ( );
		// p1.personName=name private member cannot be accessible
		p1.setPersonName(Name);
		p1.setPersonAge(Age);
		p1.setPersonCity(City);
		System.out.println("Person Details Name : " + p1.getPersonName( ) + "\tAge : " + p1.getPersonAge( ) + "\tCity : "
				+ p1.getPersonCity( ));

		System.out.println("Enter Person details : Name, age and city");
		Name = sc.nextLine ( );
		Age = sc.nextInt ( );
		City = sc.nextLine ( );
		p1 = new Person(Name, Age, City); 
		// Parameterized Constructor invoked);
		System.out.println("Person Details Name : " + p1.getPersonName( ) + "\tAge : " + p1.getPersonAge( ) + "\tCity : "
				+ p1.getPersonCity( ));
		sc.close( );
	}
}
