import java.util.*;
class Sub
{
	public static void main(String args[])
	{
			Scanner s=new  Scanner(System.in);
			System.out.println("enter the string:");
			
			String str=s.nextLine();
			
			System.out.println("enter the Substring");
			String str1=s.nextLine();
			if(str.contains(str1))
			{
			int n=str.indexOf(str1);
			int e=n+str1.length();
			System.out.println(str.substring(n,e));
			}
			else
			{
			System.out.println("not found");
			}
			
			System.out.println(str.startsWith(str1));
			System.out.println(str.endsWith(str1));
	}
}
			
