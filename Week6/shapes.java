import java.util.*;

class shape
{
	//double radius,length,breadth;
	double area(double length,double breadth)
	{
		return 0;
	}
	double perimeter(double length,double breadth)
	{
	return 0;
	}
	double area(double radius)
	{
		return 0;
	}
	double perimeter(double radius)
	{
		return 0;
	}

	
	
}
class rectangle extends shape
{
	/*rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}*/
	double area(double length,double breadth)
	{
	
	return length*breadth;
	}
	double perimeter(double length,double breadth)
	{
	return 2*(length+breadth);
	}
}
class circle extends shape
{
	/*circle(double radius)
	{
		this.radius=radius;
	}*/
	double area(double radius)
	{
	return Math.PI*radius*radius;
	}
	double perimeter(double radius)
	{
	return 2*Math.PI*radius;
	}
}
class shapes
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		rectangle r=new rectangle();
		double rad,len,b;
		System.out.println("enter the length:");
		len=s.nextDouble();
		System.out.println("enter the breadth:");
		b=s.nextDouble();
		System.out.println("Area of rectangle="+r.area(len,b)+" "+"perimeter of rectangle="+r.perimeter(len,b));
		circle c=new circle();
		System.out.println("eneter the radius of circle:");
		rad=s.nextDouble();
		System.out.println("Area of circle="+c.area(rad)+" " +" perimeter of circle="+c.perimeter(rad));
	}
}

