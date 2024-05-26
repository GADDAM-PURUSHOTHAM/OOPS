import java.lang.*;
import java.util.*;
class Greater
{
   public static void main(String args[])
{
  	Scanner s=new Scanner(System.in);
  	System.out.println("Enter the a,b,c");
  	int a,b,c;
  	a=s.nextInt();
  	b=s.nextInt();
  	c=s.nextInt();
  	if(a>b && a>c)
  	{

  	System.out.println(a);
  	}
  	else if(b>c)
  	{
        System.out.println(b);
        }
	else
	{
         System.out.println(c);
         }
}
}
