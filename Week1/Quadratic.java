import java.lang.*;
import java.util.*;
 class Quadratic
{
    public static void main(String args[])
    {
         float a,b,c;
         double r1,r2;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the a,b,c");
         a=s.nextFloat();
         b=s.nextFloat();
         c=s.nextFloat();
         r1=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
         r2=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
         System.out.println("roots are "+r1+ " " +r2);
     }
}

