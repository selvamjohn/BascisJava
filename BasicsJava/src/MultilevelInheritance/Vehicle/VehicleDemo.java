//Program to Demonstrate the Multilevel Inheritance :

package MultilevelInheritance.Vehicle;

public class VehicleDemo 
{
	public static void main(String [ ] args)
	{
		Car c;
		c=new Car ( );
		c.vehicleType ( );
		
		Maruti m=new Maruti ( );
		
		m.vehicleType ( );
		m.Brand ( );
		m.Speed ( );
		
		Maruti800 m1=new Maruti800 ( );
		
		m1.vehicleType ( );
		m1.Brand ( );
		m1.Speed ( );	
	} 
}