import java.util.*;
class Reverse
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		int i;
		for(i=str1.length()-1;i>=0;i--)
		{
		System.out.print(str1.charAt(i));
		}
	}
}
