import java.util.*;

abstract class shape
{
	abstract double getArea();
	abstract double getVolume();
}
class Square extends shape
{	
	double side;
	
	Square(double side)
	{
		this.side=side;
	}
	double getArea()
	{
		return side*side;
	}
	double getVolume()
	{
		return 0;
	}
}
class Circle extends shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	double getArea()
	{
		return Math.PI*radius*radius;
	}
	double getVolume()
	{
		return 0;
	}
}
class Cube extends shape
{
	double side;
	Cube(double side)
	{
		this.side=side;
	}
	double getArea()
	{
		return  6*side*side;
	}
	double getVolume()
	{
		return side*side*side;
	}
}
class Sphere extends shape
{
	double radius;
	Sphere(double radius)
	{
		this.radius=radius;
	}
	double getArea()
	{
		return 4*Math.PI*radius*radius;
	}
	double getVolume()
	{
		return (4/3)*Math.PI*radius*radius*radius;
	}
}
class shapes
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double r,si;
		System.out.println("enter the Side length:");
		si=s.nextDouble();
		System.out.println("enter the radius:");
		r=s.nextDouble();
		Square S=new Square(si);
		System.out.println("Area of the Square="+S.getArea());
		Circle c=new Circle(si);
		System.out.println("Area of the circle="+c.getArea());
		Cube cu=new Cube(si);
		System.out.println("Area of the Cube="+cu.getArea());
		System.out.println("Volume of the Cube="+cu.getVolume());
		Sphere sp=new Sphere(r);
		System.out.println("Area of thr Sphere="+sp.getArea());
		System.out.println("Volume of the Sphere="+sp.getVolume());
	}
}

		
	
		
