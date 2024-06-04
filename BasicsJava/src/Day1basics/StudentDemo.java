package Day1basics;
import java.util.Scanner;
public class StudentDemo 
{
	public static void main(String[] args) 
 	{    
		int sid;
		String sname;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the sid and name:");
		sid=s.nextInt();
		sname=s.next();
		
		System.out.print("sid:"+sid+" and sname:"+sname);
    }

}
