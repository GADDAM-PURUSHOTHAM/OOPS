import java.util.*;
class Index
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String:");
		
		String str1=s.next();
		//String str2=s.next();
int a,i,	c=0;
char alphabet=s.next().charAt(0);
for(i=0;i<str1.length();i++)
{
	if(str1.charAt(str1.indexOf(alphabet))==str1.charAt(i))
	{
	c++;
	}
}
System.out.println(c);
}
}
		//System.out.println(str1.indexOf());
		
		
