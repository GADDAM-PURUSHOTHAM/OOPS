import java.util.*;

public class Calculator
{
   public static void main(String args[])
   {
        Scanner s=new Scanner(System.in);
        int a,b;
         
        System.out.println("enter the a,b values:");
        System.out.println("enter the operator:");
        a=s.nextInt();
        b=s.nextInt();
        char c=s.next().charAt(0);
        switch(c)
        {
        case '+':System.out.println(a+b);
        break;
        case '-':System.out.println(a-b);
        break;
        case '*':System.out.println(a*b);
        break;
        case '/':System.out.println(a/b);
        break;
        default:System.out.println("invalid");
        
        }
    }
}
      
            
