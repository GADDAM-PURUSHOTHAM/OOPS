import java.lang.*;
import java.util.*;

class Largesmall
{
   public static void main(String args[])
   {	
   	Scanner s=new Scanner(System.in);
   	int a,b,c,d,e;
   	a=s.nextInt();
   	b=s.nextInt();
   	c=s.nextInt();
   	d=s.nextInt();
   	e=s.nextInt();
   	System.out.println("Largest NUmber:");
   	if(a>b && a>c && a>d &&a>e)
   {System.out.println(a);
   }
   else if(b>c &&b>d &&b>e)
   {System.out.println(b);
   }
   else if(c>d && c>e)
   {System.out.println(c);
   }
   else if(d>e)
   {System.out.println(d);
   }
   else
   {System.out.println(e);}
   System.out.println("Smallest NUmber:");
   if(a<b && a<c && a<d && a<e)
   {System.out.println(a);
   }
   
   else if(b<c &&b<d &&b<e)
  { System.out.println(b);}
   else if(c<d && c<e)
   {
   System.out.println(c);
   }
   else if(d<e){
   System.out.println(d);}
   else{
   System.out.println(e);
   }
   
   
   }
   
  }	
   
