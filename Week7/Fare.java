import java.util.*;
interface fare
{
	double getAmount();
}
class bus implements fare 
{
	double km;
	double charges;
	bus(double km,double charges)
	{
		this.km=km;
		this.charges=charges;
	}
	public double getAmount()
	{
		return km*charges;
	}
}
class train implements fare
{
	double km;
	double charges;
	train(double km,double charges)
	{
		this.km=km;
		this.charges=charges;
	}
	public double getAmount()
	{
		return km*charges;
	}
}
class Fare
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		double k,c,ki,ci;
		System.out.println("ON BUS");
		System.out.println("How many kilometers will be travel:");
		k=s.nextDouble();
		System.out.println("charges for 1 kilometer on bus:");
		c=s.nextDouble();
		bus b=new bus(k,c);
		System.out.println("user Sucessfully paid="+b.getAmount());
		System.out.println("----------------------------------");
		System.out.println("ON TRAIN");
		System.out.println("How many kilometers will be travel:");
		ki=s.nextDouble();
		System.out.println("charges for 1 kilometer on train:");
		ci=s.nextDouble();
		train t=new train(ki,ci);
		System.out.println("user Sucessfully paid="+t.getAmount());
	}
}

		
		 
	
	

