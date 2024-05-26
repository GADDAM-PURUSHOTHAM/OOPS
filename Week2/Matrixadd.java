import java.lang.*;
import java.util.*;


 class Matrixadd
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
	if(r==r && c==c)
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
	for(int i=0;i<C.length;i++)
	{
	for(int j=0;j<C.length;j++)
	{
	C[i][j]=B[i][j]+A[i][j];
	}}
	
	for(int x[]:C)
	{
	for(int y:x)
	{
	System.out.print(y+" ");
        }
        System.out.println(" ");
        }}
        
}}
