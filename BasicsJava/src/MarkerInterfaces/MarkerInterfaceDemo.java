// Usage of the Marker Interface :
package MarkerInterfaces;
public class MarkerInterfaceDemo
{
	public static void main(String [ ] args)
	{
		Student s=new Student(101,"Nova",12000,"C++");
		if (s instanceof Registrable )
			System.out.println("Student is Registered for the Course");
		else
			System.out.println("Student is not Registered for the Course");
	}

}

