import java.util.*;
class wp{
public static void main(String...args){

Integer i1=new Integer(42);
Integer i2=Integer.valueOf("123");
int s=i1+i2;
System.out.println("sum of integers "+s);

Double d1=new Double(3.14);
Double d2=Double.valueOf("2.714");
double s1=d1*d2;
System.out.println("product of double "+s1);

Boolean b1=new Boolean(true);
Boolean b2=Boolean.valueOf("true");
boolean s2=b1 && b2;
System.out.println("result of boolean operation "+s2);
}

}
