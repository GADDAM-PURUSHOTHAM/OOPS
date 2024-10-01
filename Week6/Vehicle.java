import java.util.*;

class vehicle
{
	String vnumber;
	String inumber;
	String color;
	void setinfo(String vnumber,String inumber,String color)
	{
		this.vnumber=vnumber;
		this.inumber=inumber;
		this.color=color;
	}
	void vdetail()
	{
		System.out.println("Vehicle Number="+vnumber);
		System.out.println("Vehicle isurance Number="+inumber);
		System.out.println("Vehicle Color="+color );
	}
	
	double fuel;
	void setcomsumption(double fuel)
	{
		this.fuel=fuel;
	}
        void getcomsumption()
        {
		System.out.println("Fuel Comsumption="+fuel);
	}

	
	
	
}
 class Twowheeler extends vehicle
{	
	double mt,avg;
	void setma(double mt,double avg)
	{
		this.mt=mt;
		this.avg=avg;
	}
	 double maintenance()
	{
	
		return mt;

	}
	double  average()
	{
	return avg;
	
	}
}
class Fourwheeler extends vehicle
{	
	double mt,avg;
	void setma(double mt,double avg)
	{
		this.mt=mt;
		this.avg=avg;
	}
	 double  maintenance()
	{
	return mt;
	}
	double  average()
	{
	return avg;
	}
}

class Vehicle
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		Twowheeler t=new Twowheeler();
		t.setinfo("AB1234","9676792210","Grey");
		t.vdetail();
		t.setcomsumption(5);
		t.getcomsumption();
		double m,a;
		System.out.println("enter the maintenance of vehicle(Two wheeler):");
		m=s.nextDouble();
		System.out.println("enter the Average of Two wheeler:");
		a=s.nextDouble();
		t.setma(m,a);
		System.out.println("Maintenance="+t.maintenance());
		System.out.println("Average="+t.average());
		System.out.println("----------------------------------------------------------------------");
		Fourwheeler f=new Fourwheeler();
		f.setinfo("YZ1234","9951206105","white");
		f.vdetail();
		f.setcomsumption(10);
		f.getcomsumption();
		double mf,af;
		System.out.println("enter the maintenance of vehicle(Four wheeler):");
		mf=s.nextDouble();
		System.out.println("enter the Average of Four wheeler:");
		af=s.nextDouble();
		f.setma(mf,af);
		System.out.println("Maintenance="+f.maintenance());
		System.out.println("Average="+f.average());
	}
}
		
		
		
		
		
