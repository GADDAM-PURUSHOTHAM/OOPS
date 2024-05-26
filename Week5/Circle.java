import java.util.*;
class Cir
{
	double Area(double radius)
	{
	return Math.PI *radius*radius;
	}
	double Perimedal(double radius)
	{
	return 2*Math.PI*radius;
	}
}
class Circle
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
Cir c=new Cir();
double r=s.nextDouble();
System.out.println("Area of Circle:"+c.Area(r));
System.out.println("perimedal of circle:"+c.Perimedal(r));
}}
