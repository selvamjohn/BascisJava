//Program to Demonstrate Static Variable
package StaticVariables;
public class Employee 
{
// Declare Instance Variables.
	private String name;
	private int id;
// Declare a Static Variable CompanyName with Data Type String and Assign Value
// Titan which is Common for all the Objects.
	static String companyName = "Titan";
// Declare a two-parameter Constructor with Parameters named n and i.
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
@Override
	public String toString ( )
	{
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}
}

