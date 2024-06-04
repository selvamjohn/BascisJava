//Program to Define Abstract Class :
package Abstraction;
//Abstract Class
public abstract class Shape 
{
   protected float area;   
//Abstract Method 
	 abstract void calArea ( );
//Concrete Method
	 void show ( )
	 {
		 System.out.println("Area of shape is "+area);
	 }
}