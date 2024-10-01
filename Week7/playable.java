import java.util.*;

interface Playable
{
	double getAmount();
	//String get();
}
class invoice implements Playable
{
	String invaice;
	double amount;
	invoice(String invaice,double amount)
	{
		this.invaice=invaice;
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}
	public String geti()
	{
		return invaice;
	}
}
class Employee implements Playable 
{
	String empid;
	double salary;
	Employee(String empid,double salary)
	{	
		this.salary=salary;
		this.empid=empid;
	}
	public double getAmount()
	{
		return salary;
	}
	public String get()
	{
		return empid;
	}
}
class playable
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		double S,A;
		String i,em;
		System.out.println("enter the invoice number & amount:");
		i=s.next();
		A=s.nextDouble();
		
		invoice in=new invoice(i,A);
		System.out.println("Invoice Number="+in.geti());
		System.out.println("Amount of the INvoice="+in.getAmount());
		System.out.println("enter the EMployee id & Salary:");
		em=s.next();
		S=s.nextDouble();
		
		Employee e=new Employee(em,S);
		System.out.println("Employyee id="+e.get());
		System.out.println("Employee Salary="+e.getAmount());
		System.out.println("--------------------------------------------");
		double p=in.getAmount()+e.getAmount();
		System.out.println("Total Employee Amount="+p);
	}
}
		
		
	
	
