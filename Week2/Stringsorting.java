import java.lang.*;
import java.util.*;
class Stringsorting
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the strings:");
	int n,i,j;
	n=s.nextInt();
	
	String a[]=new String[n];
	String t;
	System.out.println("enter the names:");
	s.nextLine();
	for(i=0;i<n;i++)
	{
	
	a[i]=s.nextLine();
	 }
	 for(i=0;i<n;i++)
	 {
	 for(j=i+1;j<n;j++)
	 {
		if(a[i].compareTo(a[j])>0)
		{
	t=a[i];
	a[i]=a[j];
	a[j]=t;
	}
}}
System.out.println("Sorted names are:");

for(i=0;i<n;i++)
{
System.out.println(a[i]+ " ");
}
}
}

	
	
