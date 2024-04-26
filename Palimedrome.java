import java.lang.*;
import java.util.*;
class Palimedrome
{
   public static void main(String args[])
   {
        Scanner s=new Scanner(System.in);
        int n,temp,sum=0,r;
        System.out.println("Enter the number:");
        n=s.nextInt();
        temp=n;
         while(n>0)
         {
                 r=n%10;
                 n=n/10;
                 sum=sum*10+r;
         }
                System.out.println(sum);
       if(sum==temp)
       {
   		System.out.println("it is a palimedrome");
   		}
   		else
   		{
			System.out.println("it is not a palimedrome");
			}
}}
