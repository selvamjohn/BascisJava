package Day2JavaData;

public class PrimitiveDataTypes 
   {

	public static void main(String[] args) 
	{
	//byte takes 1 byte
		byte byteMax =127;
	    byte byteMin = -128;

	    System.out.println("Min range of byte is" + byteMin+ "Max range of byte is " +byteMax);
	    
	    //int - 4bytes
	    int maxInt =2147483647;
	    int minInt = -2147483648;
	    
	    System.out.println("Minint range of byte is" + minInt + "Maxint range of byte is " +maxInt);
	    
	    //long - 8bytes
	    long maxLong = 9223372036854775807L;
	    long minLong = -9223372036854775807L;
	    
	    System.out.println("Minlong range of byte is" + minLong + "MaxLong range of byte is " +maxLong);
	    
	    float f=3234.141243278345f;
	    System.out.println("float value is "+f+" double value is "+f);
	    
	    //boolean
	    boolean flag=false;
	    System.out.println(" boolean value is "+flag);
	
	}

}
