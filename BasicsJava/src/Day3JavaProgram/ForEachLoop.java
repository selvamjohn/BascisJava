package Day3JavaProgram;

public class ForEachLoop
		{
	public static void main(String[] args) 
		{
			int a [ ] = {10,20,30,40,50};
// for Integer array
		 	for (int i : a)
		 	{
		 		System.out.println(i);
		 	}
		 	char ch [ ] = { 'j','a','v','a' };
		 	for (char c : ch)
		 	{
		 		System.out.println(c);
		 	}
		 	System.out.println("  ");
		 	String s1 [ ] = {"Java", "Programming", "Learning" };
//for Sting array
		 	for (String s : s1)
		 	{
		 		System.out.println(s+"  ");
		 	}
		}
}
