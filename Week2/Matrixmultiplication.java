import java.lang.*;
import java.util.*;


 class Matrixmultiplication
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int r,c;
	System.out.println("Enter the row & column");
	
	r=s.nextInt();
	c=s.nextInt();
	int A[][]=new int [r][c];
	int B[][]=new int[r][c];
	int C[][]=new int[r][c];
	if(c==r )
	{
	for(int i=0;i<A.length;i++)
	{
	for(int j=0;j<A.length;j++)
	{
	A[i][j]=s.nextInt();
	}}
	for(int i=0;i<B.length;i++)
	{
	for(int j=0;j<B.length;j++)
	{
	B[i][j]=s.nextInt();
	}}
	
	for(int i=0;i<r;i++)
	{ 
	
	for(int j=0;j<c;j++)
	{C[i][j]=0;
	for(int k=0;k<c;k++)
	{
	C[i][j]=C[i][j]+A[i][k]*B[k][j];
	}
	}}}
	else
	{
		System.out.println("enter the c1 and r2 equals");
	}
	for(int x[]:C)
	{
for(int y:x)
{
System.out.print(y+" ");
}
System.out.println(" ");
}
}
}
	
