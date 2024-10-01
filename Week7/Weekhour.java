import java.util.*;
abstract class Employee
{
	abstract double getAmount();
}
class WeeklyEmployeed extends Employee
{
	double weekamt;
	int week;
	WeeklyEmployeed(double weekamt,int week)
	{
		this.weekamt=weekamt;
		this.week=week;
	}
	double getAmount()
	{
		return weekamt*week;
	}
}
class HourlyEmployee extends Employee
{
	double houramt;
	int hour;
	HourlyEmployee(double houramt,int hour)
	{
		this.houramt=houramt;
		this.hour=hour;
	}
	double getAmount()
	{
		return houramt*hour;
	}
}
class Weekhour
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		double w,h;
		int tw,th;
		w=s.nextDouble();
		tw=s.nextInt();
		
		WeeklyEmployeed ww=new WeeklyEmployeed(w,tw);
		System.out.println("Total amount of the Employee in a Week wise:"+ww.getAmount());
		h=s.nextDouble();
		th=s.nextInt();
		HourlyEmployee hh=new HourlyEmployee(h,th);
		System.out.println("Total amount of the Employee in a hour wise:"+hh.getAmount());
	}
}

	
