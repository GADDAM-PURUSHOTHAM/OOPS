import java.util.*;
interface vehicle
{
	String getColor();
	String getNumber();
	double getConsumption();
}
class Twowheeler implements vehicle
{	
	String color,number;
	double con;
	Twowheeler(String color,String number,double con)
	{
		this.color=color;
		this.number=number;
		this.con=con;
	}
	public String getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return number;
	}
	public double getConsumption()
	{
		return con;
	}
}
class Fourwheeler implements vehicle 
{
	String color,number;
	double con;
	Fourwheeler(String color,String number,double con)
	{
		this.color=color;
		this.number=number;
		this.con=con;
	}
	public String getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return number;
	}
	public double getConsumption()
	{
		return con;
	}
}
class Vehicle
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		String c,n;
		double co;
		System.out.println("enter the Two wheeler vehicle color,number,consumption:");
		c=s.next();
		n=s.next();
		co=s.nextDouble();
		Twowheeler t=new Twowheeler(c,n,co);
		System.out.println("Two Wheeler");
		
		System.out.println("color="+t.getColor()+" "+"Number="+t.getNumber()+" "+ "Consumption="+t.getConsumption());
		String ci,coni;
		double no;
		System.out.println("enter the Four wheeler vehicle color,number,consumption:");
		ci=s.next();
		coni=s.next();
		no=s.nextDouble();
		Fourwheeler f=new Fourwheeler(ci,coni,no);
		System.out.println("--------------------------------------------");
		
		System.out.println("Four Wheeler");
		
		System.out.println("color="+f.getColor()+" "+"Number="+f.getNumber()+" "+ "Consumption="+f.getConsumption());
	}
}

