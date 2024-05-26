import java.lang.*;
import java.util.*;
class Arraysort
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
	for(int i=0;i<n;i++)
	{
	for(int j=i+1;j<n;j++)
	{
	if(a[i]>a[j])
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}}
	for(int i=0;i<n;i++)
	{
System.out.print(a[i]+" ");
}
}}

