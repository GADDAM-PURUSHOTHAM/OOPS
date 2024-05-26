import java.lang.*;
import java.util.*;
class Binarysearch
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n,i,j,temp;
	System.out.println("enter the Size:");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter the element:");
	for(i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	}
	for(i=0;i<n;i++)
	{
	for(j=i+1;j<n;j++)
	{
	if(a[i]>a[j])
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}}
	}
	for(i=0;i<n;i++)
	{
	
	System.out.print(a[i]+" ");
	}

System.out.println("enter the key:");
int key,found=0;
key=s.nextInt();

int mid=0,high=n-1,low=0;
while(low<=high)
{

mid=(high+low)/2;
if(key==a[mid])
{
found=1;
break;

}
else if(key>a[mid])
{
low=mid+1;
}
else
{
high=mid-1;

}}

if(found==1)
{
System.out.println(key+"the element is found at location "+mid);
}
else
{
System.out.println("not found:");
}
}}

