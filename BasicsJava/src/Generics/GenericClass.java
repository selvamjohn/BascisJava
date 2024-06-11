//Program to Demonstrate User Defined Generic Class :
package Generics;
//Generic Class
class GenericClass<T>
{
	T data;
	void set(T data)
	{
		this.data=data;
	}
	T get ( )
	{
		return data;
	}
}