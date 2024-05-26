import java.util.*;
class Equal
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the strings:");
		String str1=s.next();
		String str2=s.next();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
