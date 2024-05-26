import java.lang.*;
import java.util.*;
class Arrayrotation
{
 	public static void main(String args[])
 	{
 	int A[]={1,2,3,4,5,6,7,8,9,0};
 	int temp;
 	for(int a:A)
 	{
 	System.out.println(a);
 	}
 	
 	temp=A[0];
 	for(int i=1;i<A.length;i++)
 	{
 	A[i-1]=A[i];
 	}
A[A.length-1]=temp;
for(int b:A)
{
System.out.println(b);
}
}}
 	
