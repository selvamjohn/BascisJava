//Program to Demonstrate Static Variables
package StaticVariables;
public class EmployeeDemo
{
	public static void main(String [ ] args)
	{
// Create the First Object of the Class and Pass the Two Arguments with Type
// String and Integer
		System.out.println(Employee.companyName);
		Employee e = new Employee("Nova", 22);
		System.out.println(e);
// Similarly, Create the Second Object of the Class and Pass the Two Arguments
		e = new Employee("Ava", 12);
		System.out.println(e);
	}
}
