import java.lang.*;
import java.util.*;
class Linearsearch
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n,temp;
	System.out.println("enter the Size:");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter the element:");
	for(int i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	}
	System.out.println("enter the searching element:");
	int b;
	b=s.nextInt();
	
	for(int i=0;i<n;i++)
	{
	if(a[i]==b)
	{
	System.out.println(a[i]+"the element is found at "+i);
	return ;
	
	}
	}
	System.out.println("the element is not found");
	}
	}
	
