import java.util.*;
class Vowel
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Strings;");
		String str1=s.nextLine();
		int v=0,i,c=0,S=0;
		for(i=0;i<str1.length();i++)
		{
		if(str1.charAt(i)=='a' || str1.charAt(i)=='o' || str1.charAt(i)=='u' || str1.charAt(i)=='e' || str1.charAt(i)=='i')
		{
		System.out.println(str1.charAt(i));
		v++;
		
		}
		else if(str1.charAt(i)==' ')
		{
		S++;
		}
		
		else
		{
		c++;
		}
		}
		System.out.println("Vowel are "+v);
		System.out.println("Consonent are "+c);
	}
}
