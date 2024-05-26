import java.util.*;
class Duplicate
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		int a[]={0,0,0,0,0},t,i,j,c=0,r=0;
		System.out.println("enter the 5 uquinue values in between 10&100");
		for(i=0;i<5;i++)
		{
		t=S.nextInt();
		if(t>=10 && t<=100)
		{
		for(j=0;j<r;j++)
		{
		if(a[j]==t)
		
		c++;
		}
		if(c>0)
		{
		System.out.println("duplicate values found Retry;");
		c--;
		i--;
		continue;
		}
		else
		{
			a[i]=t;
			r++;
			}
}
else
{
System.out.println("the values must be int between 10 & 100");
i--;
}}
System.out.println("the vlues five values are :");
for(i=0;i<5;i++)
{
System.out.println(a[i]+" ");
}}}
		
		
