import java.lang.*;
import java.util.*;

class Emp 
{
	
       
 	public static void main(String [] args)
 	{
 	Scanner s=new Scanner(System.in);
 	int n;
 	System.out.println("eneter the size of Employees");
 	n=s.nextInt();
 	int []id=new int[n];
 	String []name=new String[n];
 	int []age=new int[n];
 	String []gender=new String[n];
 	String []design=new String[n];
 	int []salary=new int[n];
 	String []address=new String[n];
 	
 	
 	for(int i=0;i<n;i++)
 	{
	System.out.println("enter the employees details");
	System.out.println("enter the employees ids");
	id[i]=s.nextInt();
	System.out.println("enter the employees names:");
	name[i]=s.next();
	System.out.println("enter the employees age:");
	age[i]=s.nextInt();
	System.out.println("enter the employees gender :");
	gender[i]=s.next();
	System.out.println("enter the employees design:");
	design[i]=s.next();
	System.out.println("enter the employees salary;");
	salary[i]=s.nextInt();
	System.out.println("enter the employees address :");
	address[i]=s.next();
	}
	int key;
	System.out.println("enter the search of id:");
	key=s.nextInt();
	for(int i=0;i<n;i++)
	{
	if(key==id[i])
	{
	System.out.println(" id="+id[i]+" ");
	System.out.println(" name="+name[i]+" ");
	System.out.println(" age="+age[i]+" ");
	System.out.println(" gender="+gender[i]+" ");
	System.out.println(" design="+design[i]+" ");
	System.out.println(" salary="+salary[i]+" ");
	System.out.println(" address="+address[i]+" ");
	return;
	}}
	 System.out.println("id is not found");
	 
 }}
	 
	
	
