import java.lang.*;
import java.util.*;

class Primefactor
{
   public static void main(String args[])
   {
	Scanner s=new Scanner(System.in);
	int n,c;
	n=s.nextInt();
	System.out.println("Enter the Number:");
	for(int i=2;i<=n;i++)
	{
	c=0;
	for(int j=1;j<=i;j++)
	{
	if(i%j==0)
	{
	c++;
	System.out.println(i);
	}}
	//if(c==2)
	//{
	//	System.out.println(i);
	//}
	if(c==2 && n%i==0)
	{
	System.out.println("  "+i);
	
	}
	}
	}}
	
