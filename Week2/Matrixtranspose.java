import java.lang.*;
import java.util.*;


 class Matrixtranspose
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int r,c;
	System.out.println("Enter the row & column");
	
	r=s.nextInt();
	c=s.nextInt();
	int A[][]=new int [r][c];
	int B[][]=new int[c][r];
	
	for(int i=0;i<A.length;i++)
	{
	for(int j=0;j<A.length;j++)
	{
	A[i][j]=s.nextInt();
	}}
	for(int i=0;i<c;i++)
	{
	for(int j=0;j<r;j++)
	{
	B[i][j]=A[j][i];
	}}
	for(int x[]:B)
	{
	for(int y:x)
	{
	System.out.print(y+" ");
	}
System.out.println(" ");
}
}}
