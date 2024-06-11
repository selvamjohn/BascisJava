//Program to demonstrate Single Inheritance 
package SingleInheritance;

public class SingleInheritanceDemo 
{
	public static void main(String [ ] args)
	{
		
		Citizen c = new Citizen("Peter Parker", "258741962525", "Queens", 9159186845L);
		System.out.println(c);
		
		Student student = new Student("Michelle Jones", "8080808080", "Woodside", 9888878787L, 10, "Empire State University");
		System.out.println(student);
	}
}