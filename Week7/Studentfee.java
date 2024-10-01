import java.util.*;
interface studentfee
{
	double getAmount();
	String getFirstName();
	String getLastName();
	String getAddress();
	String getContact();
}
class Hostler implements studentfee
{	
	double amount;
	String fname,lname,address;
	String no;
	
	Hostler(double amount,String fname,String lname,String address,String no)
	{
		this.amount=amount;
		this.fname=fname;
		this.lname=lname;
		this.address=address;
		this.no=no;
	}
	public String getFirstName()
	{
		return fname;
	}
	public String getLastName()
	{
		return lname;
	}
	public String getAddress()
	{
		return address;
	}
	public double getAmount()
	{
		return amount;
	}
	public String getContact()
	{
		return no;
	}
}
class NonHostler implements studentfee
{	
	double amount;
	String fname,lname,address,no;
	
	
	NonHostler(double amount,String fname,String lname,String address,String no)
	{
		this.amount=amount;
		this.fname=fname;
		this.lname=lname;
		this.address=address;
		this.no=no;
	}
	public String getFirstName()
	{
		return fname;
	}
	public String getLastName()
	{
		return lname;
	}
	public String getAddress()
	{
		return address;
	}
	public double getAmount()
	{
		return amount;
	}
	public String getContact()
	{
		return no;
	}
}
class Studentfee
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		double a,aa;
		String ad,ln,n,fn;
		System.out.println("enter the student first and Last name:");
		fn=s.next();
		ln=s.next();
		System.out.println("enter the student Address;");
		ad=s.next();
		System.out.println("enter the student Number:");
		n=s.next();
		Hostler h=new Hostler(1500,fn,ln,ad,n);
		System.out.println("First name="+h.getFirstName());
		System.out.println("Last name="+h.getLastName());
		System.out.println("Address="+h.getAddress());
		System.out.println("Number="+h.getContact());
		System.out.println("Student Successfully Paid their Hostler fee="+h.getAmount());
		System.out.println("------------------------------");
		NonHostler nh=new NonHostler(5000,fn,ln,ad,n);
		System.out.println("First name="+nh.getFirstName());
		System.out.println("Last name="+nh.getLastName());
		System.out.println("Address="+nh.getAddress());
		System.out.println("Number="+nh.getContact());
		System.out.println("Student Successfully Paid their Non-Hostler fee="+nh.getAmount());
	}
}
		
		
		
		
	 	
